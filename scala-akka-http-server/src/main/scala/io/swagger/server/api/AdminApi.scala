package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Body
import io.swagger.server.model.Organization
import java.util.UUID

class AdminApi(
    adminService: AdminApiService,
    adminMarshaller: AdminApiMarshaller
) {
  import adminMarshaller._

  lazy val route: Route =
    path("org") { 
      post {
        
          
            
              
                entity(as[Body]){ body =>
                  adminService.createOrg(body = body)
                }
             
           
         
       
      }
    } ~
    path("org") { (orgId) => 
      delete {
        
          
            
              
                
                  adminService.deleteOrg(orgId = orgId)
               
             
           
         
       
      }
    } ~
    path("org") { (orgId) => 
      get {
        
          
            
              
                
                  adminService.getOrg(orgId = orgId)
               
             
           
         
       
      }
    } ~
    path("org") { 
      get {
        
          
            
              
                
                  adminService.listOrgs()
               
             
           
         
       
      }
    }
}

trait AdminApiService {

  def createOrg201(responseOrganization: Organization)(implicit toEntityMarshallerOrganization: ToEntityMarshaller[Organization]): Route =
    complete((201, responseOrganization))
  /**
   * Code: 201, Message: Организация создана, возвращается объект орагнизации, DataType: Organization
   */
  def createOrg(body: Body)
      (implicit toEntityMarshallerOrganization: ToEntityMarshaller[Organization]): Route

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

  def listOrgs200(responseList[Organization]: List[Organization])(implicit toEntityMarshallerList[Organization]: ToEntityMarshaller[List[Organization]]): Route =
    complete((200, responseList[Organization]))
  /**
   * Code: 200, Message: Список организаций, DataType: List[Organization]
   */
  def listOrgs()
      (implicit toEntityMarshallerList[Organization]: ToEntityMarshaller[List[Organization]]): Route

}

trait AdminApiMarshaller {
  implicit def fromRequestUnmarshallerBody: FromRequestUnmarshaller[Body]


  implicit def toEntityMarshallerList[Organization]: ToEntityMarshaller[List[Organization]]

  implicit def toEntityMarshallerOrganization: ToEntityMarshaller[Organization]

}

