package io.swagger.api.factories;

import io.swagger.api.DocApiService;
import io.swagger.api.impl.DocApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:39:19.625Z[GMT]")public class DocApiServiceFactory {
    private final static DocApiService service = new DocApiServiceImpl();

    public static DocApiService getDocApi() {
        return service;
    }
}
