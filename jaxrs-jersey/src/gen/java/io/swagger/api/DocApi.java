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
import java.util.UUID;

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


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:09:07.883Z[GMT]")public class DocApi  {
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
    @Path("/{doc_ids}/predicates")
    
    @Produces({ "application/json" })
    @Operation(summary = "Найти предикатно-аргументные пары по заданным условиям", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "пары найдены", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArgumentPredicateTuple.class)))) })
    public Response getPredicates(@Parameter(description = "id документов",required=true) @PathParam("doc_ids") List<UUID> docIds
,@Parameter(description = "текст аргумента, который должны содержать пары") @QueryParam("argument") String argument
,@Parameter(description = "текст предиката, который должны содержать пары") @QueryParam("predicate") String predicate
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPredicates(docIds,argument,predicate,securityContext);
    }
}
