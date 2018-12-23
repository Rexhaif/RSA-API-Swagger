package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Body;
import io.swagger.model.Organization;
import java.util.UUID;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:09:07.883Z[GMT]")public abstract class OrgApiService {
    public abstract Response createOrg(Body body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteOrg(UUID orgId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrg(UUID orgId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listOrgs(SecurityContext securityContext) throws NotFoundException;
}
