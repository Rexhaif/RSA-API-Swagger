package io.swagger.server.model

import java.math.BigDecimal
import java.util.UUID

/**
 * @param document_id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param statistic  for example: ''0.1281''
 */
case class DocumentStatistic (
  document_id: UUID,
  statistic: BigDecimal
)

