package io.swagger.api.factories;

import io.swagger.api.OrgApiService;
import io.swagger.api.impl.OrgApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-17T16:16:40.169Z[GMT]")public class OrgApiServiceFactory {
    private final static OrgApiService service = new OrgApiServiceImpl();

    public static OrgApiService getOrgApi() {
        return service;
    }
}
