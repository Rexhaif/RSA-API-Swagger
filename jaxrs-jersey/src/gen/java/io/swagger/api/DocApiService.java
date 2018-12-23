package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:39:19.625Z[GMT]")public abstract class DocApiService {
    public abstract Response computeMarkers(List<UUID> docIds, List<String> markers,SecurityContext securityContext) throws NotFoundException;
    public abstract Response computeStats(List<UUID> docIds, List<String> statistics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPredicates(List<UUID> docIds, String argument, String predicate, String role,SecurityContext securityContext) throws NotFoundException;
    public abstract Response highlightLexics(List<UUID> docIds, List<UUID> dicts,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchDocs( String title, String author, Date createdBefore, Date createdAfter, List<String> tags,SecurityContext securityContext) throws NotFoundException;
}
