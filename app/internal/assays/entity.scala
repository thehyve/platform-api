package models.entities

import play.api.libs.json.{Json, OFormat}
import slick.jdbc.GetResult

case class InternalAssay(
  id: String,
  title: Option[String],
  method: Option[String]
)

object InternalAssay {
  implicit val getRowFromDB: GetResult[InternalAssay] = GetResult(
    r => InternalAssay(r.<<, r.<<, r.<<)
  )
  implicit val internalAssaysImp: OFormat[InternalAssay] = Json.format[InternalAssay]
}
