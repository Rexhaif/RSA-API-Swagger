package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.ArgumentPredicateTuple
import io.swagger.server.model.Corpus
import io.swagger.server.model.Document
import io.swagger.server.model.DocumentStatistic
import java.util.UUID
import io.swagger.server.model.WordTuple
import io.swagger.server.model.inline_response_200

class ReadDocsApi(
    readDocsService: ReadDocsApiService,
    readDocsMarshaller: ReadDocsApiMarshaller
) {
  import readDocsMarshaller._

  lazy val route: Route =
    path("corp" / "markers") { (corpIds) => 
      get {
        parameters("markers".as[String].?) { (markers) =>
          
            
              
                
                  readDocsService.computeMarkers(corpIds = corpIds, markers = markers)
               
             
           
         
        }
      }
    } ~
    path("corp" / "stats") { (corpIds) => 
      get {
        parameters("statistics".as[String].?) { (statistics) =>
          
            
              
                
                  readDocsService.computeStats(corpIds = corpIds, statistics = statistics)
               
             
           
         
        }
      }
    } ~
    path("corp") { (corpId) => 
      get {
        
          
            
              
                
                  readDocsService.getCorp(corpId = corpId)
               
             
           
         
       
      }
    } ~
    path("corp" / "doc") { (corpId, docId) => 
      get {
        
          
            
              
                
                  readDocsService.getDoc(corpId = corpId, docId = docId)
               
             
           
         
       
      }
    } ~
    path("corp" / "predicates") { (corpIds) => 
      get {
        parameters("argument".as[String].?, "predicate".as[String].?) { (argument, predicate) =>
          
            
              
                
                  readDocsService.getPredicates(corpIds = corpIds, argument = argument, predicate = predicate)
               
             
           
         
        }
      }
    } ~
    path("corp" / "lexics") { (corpIds) => 
      get {
        parameters("dicts".as[String].?) { (dicts) =>
          
            
              
                
                  readDocsService.highlightLexics(corpIds = corpIds, dicts = dicts)
               
             
           
         
        }
      }
    } ~
    path("corp") { 
      get {
        
          
            
              
                
                  readDocsService.listCorpuses()
               
             
           
         
       
      }
    }
}

trait ReadDocsApiService {

  def computeMarkers200(responseList[DocumentStatistic]: List[DocumentStatistic])(implicit toEntityMarshallerList[DocumentStatistic]: ToEntityMarshaller[List[DocumentStatistic]]): Route =
    complete((200, responseList[DocumentStatistic]))
  /**
   * Code: 200, Message: Маркеры рассчитаны, DataType: List[DocumentStatistic]
   */
  def computeMarkers(corpIds: String, markers: Option[String])
      (implicit toEntityMarshallerList[DocumentStatistic]: ToEntityMarshaller[List[DocumentStatistic]]): Route

  def computeStats200(responseList[inline_response_200]: List[inline_response_200])(implicit toEntityMarshallerList[inline_response_200]: ToEntityMarshaller[List[inline_response_200]]): Route =
    complete((200, responseList[inline_response_200]))
  /**
   * Code: 200, Message: Показатели рассчитаны, DataType: List[inline_response_200]
   */
  def computeStats(corpIds: String, statistics: Option[String])
      (implicit toEntityMarshallerList[inline_response_200]: ToEntityMarshaller[List[inline_response_200]]): Route

  def getCorp200(responseCorpus: Corpus)(implicit toEntityMarshallerCorpus: ToEntityMarshaller[Corpus]): Route =
    complete((200, responseCorpus))
  /**
   * Code: 200, Message: Корпус найден, возвращается объект, DataType: Corpus
   */
  def getCorp(corpId: String)
      (implicit toEntityMarshallerCorpus: ToEntityMarshaller[Corpus]): Route

  def getDoc200(responseDocument: Document)(implicit toEntityMarshallerDocument: ToEntityMarshaller[Document]): Route =
    complete((200, responseDocument))
  /**
   * Code: 200, Message: Документ найден, DataType: Document
   */
  def getDoc(corpId: String, docId: String)
      (implicit toEntityMarshallerDocument: ToEntityMarshaller[Document]): Route

  def getPredicates200(responseList[ArgumentPredicateTuple]: List[ArgumentPredicateTuple])(implicit toEntityMarshallerList[ArgumentPredicateTuple]: ToEntityMarshaller[List[ArgumentPredicateTuple]]): Route =
    complete((200, responseList[ArgumentPredicateTuple]))
  /**
   * Code: 200, Message: пары найдены, DataType: List[ArgumentPredicateTuple]
   */
  def getPredicates(corpIds: String, argument: Option[String], predicate: Option[String])
      (implicit toEntityMarshallerList[ArgumentPredicateTuple]: ToEntityMarshaller[List[ArgumentPredicateTuple]]): Route

  def highlightLexics201(responseList[WordTuple]: List[WordTuple])(implicit toEntityMarshallerList[WordTuple]: ToEntityMarshaller[List[WordTuple]]): Route =
    complete((201, responseList[WordTuple]))
  /**
   * Code: 201, Message: Слова из словарей найдены, DataType: List[WordTuple]
   */
  def highlightLexics(corpIds: String, dicts: Option[String])
      (implicit toEntityMarshallerList[WordTuple]: ToEntityMarshaller[List[WordTuple]]): Route

  def listCorpuses200(responseList[Corpus]: List[Corpus])(implicit toEntityMarshallerList[Corpus]: ToEntityMarshaller[List[Corpus]]): Route =
    complete((200, responseList[Corpus]))
  /**
   * Code: 200, Message: A array of corpuses, DataType: List[Corpus]
   */
  def listCorpuses()
      (implicit toEntityMarshallerList[Corpus]: ToEntityMarshaller[List[Corpus]]): Route

}

trait ReadDocsApiMarshaller {

  implicit def toEntityMarshallerList[Corpus]: ToEntityMarshaller[List[Corpus]]

  implicit def toEntityMarshallerList[inline_response_200]: ToEntityMarshaller[List[inline_response_200]]

  implicit def toEntityMarshallerList[WordTuple]: ToEntityMarshaller[List[WordTuple]]

  implicit def toEntityMarshallerDocument: ToEntityMarshaller[Document]

  implicit def toEntityMarshallerList[DocumentStatistic]: ToEntityMarshaller[List[DocumentStatistic]]

  implicit def toEntityMarshallerCorpus: ToEntityMarshaller[Corpus]

  implicit def toEntityMarshallerList[ArgumentPredicateTuple]: ToEntityMarshaller[List[ArgumentPredicateTuple]]

}

