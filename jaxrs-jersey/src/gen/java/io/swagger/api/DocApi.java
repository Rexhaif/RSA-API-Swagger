package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DocApiService;
import io.swagger.api.factories.DocApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ArgumentPredicateTuple;
import java.util.Date;
import io.swagger.model.Document;
import io.swagger.model.DocumentStatistic;
import io.swagger.model.InlineResponse200;
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

@Path("/doc")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:38:52.268Z[GMT]")public class DocApi  {
   private final DocApiService delegate;

   public DocApi(@Context ServletConfig servletContext) {
      DocApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DocApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DocApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DocApiServiceFactory.getDocApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{doc_ids}/markers")
    
    @Produces({ "application/json" })
    @Operation(summary = "Рассчитать психолингвистические маркеры по документам", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "analyze-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Маркеры рассчитаны", content = @Content(array = @ArraySchema(schema = @Schema(implementation = DocumentStatistic.class)))) })
    public Response computeMarkers(@Parameter(description = "id документов",required=true) @PathParam("doc_ids") List<UUID> docIds
,@Parameter(description = "Список маркеров, которые необходимо рассчитать") @QueryParam("markers") List<String> markers
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computeMarkers(docIds,markers,securityContext);
    }
    @GET
    @Path("/{doc_ids}/stats")
    
    @Produces({ "application/json" })
    @Operation(summary = "Рассчитать статистические показатели по документам", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "analyze-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Показатели рассчитаны", content = @Content(array = @ArraySchema(schema = @Schema(implementation = InlineResponse200.class)))) })
    public Response computeStats(@Parameter(description = "id документов",required=true) @PathParam("doc_ids") List<UUID> docIds
,@Parameter(description = "Список показателей, которые необходимо рассчитать") @QueryParam("statistics") List<String> statistics
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computeStats(docIds,statistics,securityContext);
    }
    @GET
    @Path("/{doc_ids}/predicates")
    
    @Produces({ "application/json" })
    @Operation(summary = "Найти предикатно-аргументные пары по заданным условиям", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "analyze-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "пары найдены", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArgumentPredicateTuple.class)))) })
    public Response getPredicates(@Parameter(description = "id документов",required=true) @PathParam("doc_ids") List<UUID> docIds
,@Parameter(description = "текст аргумента, который должны содержать пары") @QueryParam("argument") String argument
,@Parameter(description = "текст предиката, который должны содержать пары") @QueryParam("predicate") String predicate
,@Parameter(description = "название роли, которую должны реализовывать аргументы") @QueryParam("role") String role
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPredicates(docIds,argument,predicate,role,securityContext);
    }
    @GET
    @Path("/{doc_ids}/lexics")
    
    @Produces({ "application/json" })
    @Operation(summary = "Выделить специфичную лексику по словарям из документов", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "analyze-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Слова из словарей найдены", content = @Content(array = @ArraySchema(schema = @Schema(implementation = WordTuple.class)))) })
    public Response highlightLexics(@Parameter(description = "id документов",required=true) @PathParam("doc_ids") List<UUID> docIds
,@Parameter(description = "id словарей, которые необходимо использовать") @QueryParam("dicts") List<UUID> dicts
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.highlightLexics(docIds,dicts,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Поиск по всем документам", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Документы найдены", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Document.class)))),
        
        @ApiResponse(responseCode = "404", description = "") })
    public Response searchDocs(@Parameter(description = "") @QueryParam("title") String title
,@Parameter(description = "фильтровать по автору документа") @QueryParam("author") String author
,@Parameter(description = "") @QueryParam("created_before") Date createdBefore
,@Parameter(description = "фильтровать по времени создания документа(нижняя граница)") @QueryParam("created_after") Date createdAfter
,@Parameter(description = "фильтровать по тегам документа") @QueryParam("tags") List<String> tags
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchDocs(title,author,createdBefore,createdAfter,tags,securityContext);
    }
}
