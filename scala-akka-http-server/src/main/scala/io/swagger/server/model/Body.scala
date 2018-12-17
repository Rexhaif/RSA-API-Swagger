package io.swagger.server.model

import java.util.UUID

/**
 * @param title 
 * @param manager_id 
 */
case class Body (
  title: String,
  manager_id: UUID
)

