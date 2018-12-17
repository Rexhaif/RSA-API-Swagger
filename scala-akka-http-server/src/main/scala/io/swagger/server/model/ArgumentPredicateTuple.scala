package io.swagger.server.model

import java.util.UUID

/**
 * @param document_id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param role  for example: ''локатив''
 * @param predicate  for example: ''создавать''
 * @param context  for example: ''других для кого-то в постоянно <b>меняющимся</b> мире ?''
 */
case class ArgumentPredicateTuple (
  document_id: UUID,
  role: String,
  predicate: String,
  context: Option[String]
)

