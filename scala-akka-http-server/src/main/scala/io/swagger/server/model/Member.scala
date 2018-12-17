package io.swagger.server.model

import java.util.UUID

/**
 * @param id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 * @param name  for example: ''Иван Иванов''
 * @param org_id  for example: ''d290f1ee-6c54-4b01-90e6-d701748f0851''
 */
case class Member (
  id: UUID,
  name: String,
  org_id: UUID
)

