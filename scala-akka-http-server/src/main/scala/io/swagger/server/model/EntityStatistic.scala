package io.swagger.server.model

import java.math.BigDecimal

/**
 * @param entity 
 * @param statistic  for example: ''6798.0''
 */
case class EntityStatistic (
  entity: EntityStatistic_entity,
  statistic: BigDecimal
)

