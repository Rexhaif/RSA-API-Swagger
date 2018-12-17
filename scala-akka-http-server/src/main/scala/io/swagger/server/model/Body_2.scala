package io.swagger.server.model

import java.util.Date

/**
 * @param title 
 * @param text 
 * @param author 
 * @param created_at 
 */
case class Body_2 (
  title: String,
  text: String,
  author: Option[String],
  created_at: Option[Date]
)

