package io.swagger.api.factories;

import io.swagger.api.CorpApiService;
import io.swagger.api.impl.CorpApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-17T16:16:40.169Z[GMT]")public class CorpApiServiceFactory {
    private final static CorpApiService service = new CorpApiServiceImpl();

    public static CorpApiService getCorpApi() {
        return service;
    }
}
