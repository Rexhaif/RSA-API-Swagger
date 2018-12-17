package io.swagger.server.model

import java.util.Date
import java.util.UUID

/**
 * @param id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param title  for example: ''Эссе''
 * @param author  for example: ''Moscowithka''
 * @param created_at 
 * @param text  for example: ''Сейчас я закончила второй курс университета. Кстати я поступила в университет в Воронеже, а не в Липецке.''
 * @param metadata 
 */
case class Document (
  id: UUID,
  title: String,
  author: String,
  created_at: Date,
  text: Option[String],
  metadata: Option[Object]
)

