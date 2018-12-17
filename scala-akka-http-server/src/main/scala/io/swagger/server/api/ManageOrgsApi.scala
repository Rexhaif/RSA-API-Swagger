package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Organization
import java.util.UUID

class ManageOrgsApi(
    manageOrgsService: ManageOrgsApiService,
    manageOrgsMarshaller: ManageOrgsApiMarshaller
) {
  import manageOrgsMarshaller._

  lazy val route: Route =
    path("org") { (orgId) => 
      delete {
        
          
            
              
                
                  manageOrgsService.deleteOrg(orgId = orgId)
               
             
           
         
       
      }
    } ~
    path("org") { (orgId) => 
      get {
        
          
            
              
                
                  manageOrgsService.getOrg(orgId = orgId)
               
             
           
         
       
      }
    }
}

trait ManageOrgsApiService {

  def deleteOrg200: Route =
    complete((200, "Организация удалена"))
  /**
   * Code: 200, Message: Организация удалена
   */
  def deleteOrg(orgId: String): Route

  def getOrg200(responseOrganization: Organization)(implicit toEntityMarshallerOrganization: ToEntityMarshaller[Organization]): Route =
    complete((200, responseOrganization))
  /**
   * Code: 200, Message: Объект организации с данным id, DataType: Organization
   */
  def getOrg(orgId: String)
      (implicit toEntityMarshallerOrganization: ToEntityMarshaller[Organization]): Route

}

trait ManageOrgsApiMarshaller {

  implicit def toEntityMarshallerOrganization: ToEntityMarshaller[Organization]

}

