package io.swagger.server.model

import java.util.UUID

/**
 * @param id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param title  for example: ''студенты-социологи''
 * @param owner_id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param parent_id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param documents 
 */
case class Corpus (
  id: UUID,
  title: String,
  owner_id: Option[UUID],
  parent_id: Option[UUID],
  documents: Option[List[Document]]
)

