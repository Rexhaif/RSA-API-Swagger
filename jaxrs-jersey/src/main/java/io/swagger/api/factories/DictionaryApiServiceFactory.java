package io.swagger.api.factories;

import io.swagger.api.DictionaryApiService;
import io.swagger.api.impl.DictionaryApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:51:19.196Z[GMT]")public class DictionaryApiServiceFactory {
    private final static DictionaryApiService service = new DictionaryApiServiceImpl();

    public static DictionaryApiService getDictionaryApi() {
        return service;
    }
}
