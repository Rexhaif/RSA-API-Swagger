package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ArgumentPredicateTuple;
import io.swagger.model.Body1;
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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:38:52.268Z[GMT]")public abstract class CorpApiService {
    public abstract Response addDocument(UUID corpId,Document body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response computeMarkers(List<UUID> corpIds, List<String> markers,SecurityContext securityContext) throws NotFoundException;
    public abstract Response computeStats(List<UUID> corpIds, List<String> statistics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCorp(Body1 body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteCorp(UUID corpId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCorp(UUID corpId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDoc(UUID corpId,UUID docId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPredicates(List<UUID> corpIds, String argument, String predicate, String role,SecurityContext securityContext) throws NotFoundException;
    public abstract Response highlightLexics(List<UUID> corpIds, List<UUID> dicts,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listCorpuses(SecurityContext securityContext) throws NotFoundException;
}
