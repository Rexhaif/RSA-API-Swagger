package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Body_1
import io.swagger.server.model.Body_2
import io.swagger.server.model.Corpus
import java.util.UUID
import io.swagger.server.model.inline_response_201

class ManageDocsApi(
    manageDocsService: ManageDocsApiService,
    manageDocsMarshaller: ManageDocsApiMarshaller
) {
  import manageDocsMarshaller._

  lazy val route: Route =
    path("corp" / "doc") { (corpId) => 
      post {
        
          
            
              
                entity(as[Body_2]){ body =>
                  manageDocsService.addDocument(corpId = corpId, body = body)
                }
             
           
         
       
      }
    } ~
    path("corp") { 
      post {
        
          
            
              
                entity(as[Body_1]){ body =>
                  manageDocsService.createCorp(body = body)
                }
             
           
         
       
      }
    } ~
    path("corp") { (corpId) => 
      delete {
        
          
            
              
                
                  manageDocsService.deleteCorp(corpId = corpId)
               
             
           
         
       
      }
    }
}

trait ManageDocsApiService {

  def addDocument201(responseinline_response_201: inline_response_201)(implicit toEntityMarshallerinline_response_201: ToEntityMarshaller[inline_response_201]): Route =
    complete((201, responseinline_response_201))
  /**
   * Code: 201, Message: Документ создан, возвращается id, DataType: inline_response_201
   */
  def addDocument(corpId: String, body: Body_2)
      (implicit toEntityMarshallerinline_response_201: ToEntityMarshaller[inline_response_201]): Route

  def createCorp200(responseCorpus: Corpus)(implicit toEntityMarshallerCorpus: ToEntityMarshaller[Corpus]): Route =
    complete((200, responseCorpus))
  /**
   * Code: 200, Message: Корпус создан, возвращается объект созданного корпуса, DataType: Corpus
   */
  def createCorp(body: Body_1)
      (implicit toEntityMarshallerCorpus: ToEntityMarshaller[Corpus]): Route

  def deleteCorp200: Route =
    complete((200, "Корпус удален"))
  /**
   * Code: 200, Message: Корпус удален
   */
  def deleteCorp(corpId: String): Route

}

trait ManageDocsApiMarshaller {
  implicit def fromRequestUnmarshallerBody_2: FromRequestUnmarshaller[Body_2]

  implicit def fromRequestUnmarshallerBody_1: FromRequestUnmarshaller[Body_1]


  implicit def toEntityMarshallerinline_response_201: ToEntityMarshaller[inline_response_201]

  implicit def toEntityMarshallerCorpus: ToEntityMarshaller[Corpus]

}

