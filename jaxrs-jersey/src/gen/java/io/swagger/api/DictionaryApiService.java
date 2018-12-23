package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Dictionary;
import io.swagger.model.InlineResponse2011;
import java.util.UUID;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:01:53.311Z[GMT]")public abstract class DictionaryApiService {
    public abstract Response createDictionary(Dictionary body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDictionary(UUID dictId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listDictionaries(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateDictionary(UUID dictId,List<String> body,SecurityContext securityContext) throws NotFoundException;
}
