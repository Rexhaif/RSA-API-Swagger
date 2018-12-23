package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DictionaryApiService;
import io.swagger.api.factories.DictionaryApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Dictionary;
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

@Path("/dictionary")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:51:19.196Z[GMT]")public class DictionaryApi  {
   private final DictionaryApiService delegate;

   public DictionaryApi(@Context ServletConfig servletContext) {
      DictionaryApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DictionaryApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DictionaryApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DictionaryApiServiceFactory.getDictionaryApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{dict_id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Вернуть словарь по id", description = "", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "read-docs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Словарь найден", content = @Content(schema = @Schema(implementation = Dictionary.class))) })
    public Response getDictionary(@Parameter(description = "id словаря",required=true) @PathParam("dict_id") UUID dictId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDictionary(dictId,securityContext);
    }
}
