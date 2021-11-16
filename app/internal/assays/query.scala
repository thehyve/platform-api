package models.db

import esecuele._
import esecuele.Functions
import esecuele.Column._
import esecuele.Query
import play.api.Logging

case class QInternalAssays(
    tableName: String,
    ensembl_gene_id: String,
  ) extends Queryable with Logging {

  val col_ensembl_gene_id: Column = column("ensembl_gene_id")
  val col_title: Column = column("title")
  val col_method: Column = column("method")
  val table: Column = column(tableName)

  val query = {
    val query = Query(
      Select(col_ensembl_gene_id :: col_title :: col_method :: Nil),
      From(table),
      Where(Functions.equals(col_ensembl_gene_id, literal(ensembl_gene_id)))
    )
    logger.debug(query.toString)
    query
  }
}
