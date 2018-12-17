package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OrgApiService;
import io.swagger.api.factories.OrgApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Body;
import io.swagger.model.Organization;
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

@Path("/org")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-17T16:16:40.169Z[GMT]")public class OrgApi  {
   private final OrgApiService delegate;

   public OrgApi(@Context ServletConfig servletContext) {
      OrgApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OrgApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OrgApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = OrgApiServiceFactory.getOrgApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "Создать новую организацию", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Организация создана, возвращается объект орагнизации", content = @Content(schema = @Schema(implementation = Organization.class))) })
    public Response createOrg(@Parameter(description = "Название организации и id родительской" ,required=true) Body body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrg(body,securityContext);
    }
    @DELETE
    @Path("/{org_id}")
    
    
    @Operation(summary = "", description = "Удалить организацию по id", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "manage-orgs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Организация удалена") })
    public Response deleteOrg(@Parameter(description = "id удаляемой организации",required=true) @PathParam("org_id") UUID orgId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOrg(orgId,securityContext);
    }
    @GET
    @Path("/{org_id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "Вернуть всю информацию по организации", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "manage-orgs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Объект организации с данным id", content = @Content(schema = @Schema(implementation = Organization.class))) })
    public Response getOrg(@Parameter(description = "id организации",required=true) @PathParam("org_id") UUID orgId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrg(orgId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "Вывести список всех организаций", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Список организаций", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Organization.class)))) })
    public Response listOrgs(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listOrgs(securityContext);
    }
}
