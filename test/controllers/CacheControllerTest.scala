package controllers

import java.util.concurrent.TimeUnit

import akka.util.Timeout
import controllers.api.v4.graphql.GraphQLController
import controllers.api.v4.rest.CacheController
import javax.inject.Inject
import models.Backend
import models.entities.Drug
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.TestData
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import play.api.cache.AsyncCacheApi
import play.api.db.slick.DatabaseConfigProvider
import play.api.inject.bind
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.libs.json.Json
import play.api.mvc.Result
import play.api.mvc.Results.Forbidden
import play.api.test.Helpers.{contentAsString, GET, POST}
import play.api.test.{FakeRequest, Injecting}
import play.api.{Application, Configuration, Environment, Logging}
import play.db.NamedDatabase
import scala.concurrent.{Future, ExecutionContext}
import test_configuration.IntegrationTestTag

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.DurationInt

class CacheControllerTest
    extends PlaySpec
    with GuiceOneAppPerTest
    with Injecting
    with Logging
    with ScalaFutures {

  lazy val controller: CacheController = inject[CacheController]
  lazy val gqlController: GraphQLController = inject[GraphQLController]
  val apiKey = "superSecret"

  override def newAppForTest(td: TestData): Application = {
    new GuiceApplicationBuilder()
      .configure(Map("ot.apiKeyHash" -> apiKey.hashCode.toString))
      .overrides(bind[Backend].to[BreakableEsBackend])
      .build()
  }

  implicit lazy val timeout: Timeout = Timeout(1120, TimeUnit.SECONDS)

  "A cached request" must {
    "not need the database again if re-requested" taggedAs IntegrationTestTag in {
      // given: a cached request
      val query = Json.parse(
        """{ "query": "query { drugs(chemblIds: [\"CHEMBL221959\", \"CHEMBL2103743\"]) { id } }"}"""
      )
      val request = FakeRequest(POST, "/graphql")
        .withHeaders(("Content-Type", "application/json"))
        .withBody(query)
      Await.result(gqlController.gqlBody().apply(request), 10.second)
      // when: the request is repeated while the db is down
      val resultF: Future[Result] = gqlController.gqlBody().apply(request)
      // then: the response comes back without issue
      val resultHasErrors = contentAsString(resultF)(10.second).contains("errors")
      resultHasErrors mustBe false
    }
    "need the database again if the cache has been cleared" taggedAs IntegrationTestTag in {
      // given: a cached request
      val query = Json.parse(
        """{ "query": "query { drugs(chemblIds: [\"CHEMBL221959\", \"CHEMBL2103743\"]) { id } }"}"""
      )
      val request = FakeRequest(POST, "/graphql")
        .withHeaders(("Content-Type", "application/json"))
        .withBody(query)
      Await.result(gqlController.gqlBody().apply(request), 10.second)

      // when: the cache is cleared before repeating while the db is down
      val clearRequest = FakeRequest(GET, "/cache/clear").withHeaders(("apiKey", apiKey))
      Await.result(controller.clearCache().apply(clearRequest), 2.second)
      val resultF: Future[Result] = gqlController.gqlBody().apply(request)
      // then: the response reports an issue
      val resultHasErrors = contentAsString(resultF)(10.second).contains("errors")
      resultHasErrors mustBe true
    }
  }
  "A request to clear the cache" must {
    val request = FakeRequest(GET, "/cache/clear")
    "provide an `apiKey` header with correct code" in {
      // given
      val request = FakeRequest(GET, "/cache/clear").withHeaders(("apiKey", apiKey))
      // when
      val result: Result = Await.result(controller.clearCache().apply(request), 2.second)
      // then
      result.header.status mustEqual 200
    }
    "without an apiKey will result in a 403 error code" in {
      // when
      val result: Result = Await.result(controller.clearCache().apply(request), 2.second)
      // then
      result.header.status mustEqual Forbidden.header.status
    }
    "with the wrong apiKey will result in a 403 error code" in {
      // given
      val requestWithHeader = FakeRequest(GET, "/cache/clear").withHeaders(("apiKey", "luckyGuess"))
      // when
      val result: Result = Await.result(controller.clearCache().apply(requestWithHeader), 2.second)
      // then
      result.header.status mustEqual Forbidden.header.status

    }
  }
}

class BreakableEsBackend @Inject() (implicit
    ec: ExecutionContext,
    @NamedDatabase("default") dbConfigProvider: DatabaseConfigProvider,
    config: Configuration,
    env: Environment,
    cache: AsyncCacheApi
) extends Backend {

  var hasHandledARequest: Boolean = false

  override def getDrugs(ids: Seq[String]): Future[IndexedSeq[Drug]] = {
    val firstRequest = !hasHandledARequest
    hasHandledARequest = true
    firstRequest match {
      case true => super.getDrugs(ids: Seq[String])
      case false => Future.failed(new com.sksamuel.elastic4s.http.JavaClientExceptionWrapper(new Exception("Faking a broken database in a test")))
    }
  }
}
