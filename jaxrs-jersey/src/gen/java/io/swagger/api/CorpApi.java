package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CorpApiService;
import io.swagger.api.factories.CorpApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ArgumentPredicateTuple;
import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.Corpus;
import io.swagger.model.Document;
import io.swagger.model.DocumentStatistic;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse201;
import java.util.UUID;
import io.swagger.model.WordTuple;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/corp")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:59:28.366Z[GMT]")public class CorpApi  {
   private final CorpApiService delegate;

   public CorpApi(@Context ServletConfig servletContext) {
      CorpApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CorpApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CorpApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CorpApiServiceFactory.getCorpApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/{corp_id}/doc")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Загрузка нового документа в корпус", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "manage-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Документ создан, возвращается id", content = @Content(schema = @Schema(implementation = InlineResponse201.class))) })
    public Response addDocument(@Parameter(description = "id корпуса",required=true) @PathParam("corp_id") UUID corpId
,@Parameter(description = "" ) Body2 body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addDocument(corpId,body,securityContext);
    }
    @GET
    @Path("/{corp_ids}/markers")
    
    @Produces({ "application/json" })
    @Operation(summary = "Рассчитать психолингвистические маркеры по документам в указанных корпусах", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Маркеры рассчитаны", content = @Content(array = @ArraySchema(schema = @Schema(implementation = DocumentStatistic.class)))) })
    public Response computeMarkers(@Parameter(description = "",required=true) @PathParam("corp_ids") List<UUID> corpIds
,@Parameter(description = "Список маркеров, которые необходимо рассчитать") @QueryParam("markers") List<String> markers
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computeMarkers(corpIds,markers,securityContext);
    }
    @GET
    @Path("/{corp_ids}/stats")
    
    @Produces({ "application/json" })
    @Operation(summary = "Рассчитать статистические показатели по документам в указанных корпусах", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Показатели рассчитаны", content = @Content(array = @ArraySchema(schema = @Schema(implementation = InlineResponse200.class)))) })
    public Response computeStats(@Parameter(description = "",required=true) @PathParam("corp_ids") List<UUID> corpIds
,@Parameter(description = "Список показателей, которые необходимо рассчитать") @QueryParam("statistics") List<String> statistics
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computeStats(corpIds,statistics,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Создать новый корупс", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "manage-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Корпус создан, возвращается объект созданного корпуса", content = @Content(schema = @Schema(implementation = Corpus.class))) })
    public Response createCorp(@Parameter(description = "Название корпуса и id родительского(если есть)" ,required=true) Body1 body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCorp(body,securityContext);
    }
    @DELETE
    @Path("/{corp_id}")
    
    
    @Operation(summary = "Удалить корпус", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "manage-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Корпус удален") })
    public Response deleteCorp(@Parameter(description = "id корпуса",required=true) @PathParam("corp_id") UUID corpId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCorp(corpId,securityContext);
    }
    @GET
    @Path("/{corp_id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Вернуть все данные по корпусу", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Корпус найден, возвращается объект", content = @Content(schema = @Schema(implementation = Corpus.class))) })
    public Response getCorp(@Parameter(description = "id корпуса",required=true) @PathParam("corp_id") UUID corpId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCorp(corpId,securityContext);
    }
    @GET
    @Path("/{corp_id}/doc/{doc_id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Получить документ", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Документ найден", content = @Content(schema = @Schema(implementation = Document.class))) })
    public Response getDoc(@Parameter(description = "id корпуса",required=true) @PathParam("corp_id") UUID corpId
,@Parameter(description = "id документа",required=true) @PathParam("doc_id") UUID docId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDoc(corpId,docId,securityContext);
    }
    @GET
    @Path("/{corp_ids}/predicates")
    
    @Produces({ "application/json" })
    @Operation(summary = "Найти предикатно-аргументные пары по заданным условиям", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "пары найдены", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArgumentPredicateTuple.class)))) })
    public Response getPredicates(@Parameter(description = "",required=true) @PathParam("corp_ids") List<UUID> corpIds
,@Parameter(description = "текст аргумента, который должны содержать пары") @QueryParam("argument") String argument
,@Parameter(description = "текст предиката, который должны содержать пары") @QueryParam("predicate") String predicate
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPredicates(corpIds,argument,predicate,securityContext);
    }
    @GET
    @Path("/{corp_ids}/lexics")
    
    @Produces({ "application/json" })
    @Operation(summary = "Выделить специфичную лексику по словарям из документов в указанных корпусах", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Слова из словарей найдены", content = @Content(array = @ArraySchema(schema = @Schema(implementation = WordTuple.class)))) })
    public Response highlightLexics(@Parameter(description = "",required=true) @PathParam("corp_ids") List<UUID> corpIds
,@Parameter(description = "id словарей, которые необходимо использовать в рассчете") @QueryParam("dicts") List<UUID> dicts
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.highlightLexics(corpIds,dicts,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Вернуть список корпусов", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A array of corpuses", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Corpus.class)))) })
    public Response listCorpuses(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCorpuses(securityContext);
    }
}
