package io.swagger.server.model

import java.util.UUID

/**
 * @param id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param title  for example: ''Филологический факультет МГУ''
 * @param manager_id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param parent_id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param members 
 */
case class Organization (
  id: UUID,
  title: String,
  manager_id: UUID,
  parent_id: Option[UUID],
  members: Option[List[Member]]
)

