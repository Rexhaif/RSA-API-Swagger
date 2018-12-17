package io.swagger.server.model


/**
 * @param entity_type 
 * @param entity_name  for example: ''количество слов''
 */
case class EntityStatistic_entity (
  entity_type: Option[String],
  entity_name: Option[String]
)

