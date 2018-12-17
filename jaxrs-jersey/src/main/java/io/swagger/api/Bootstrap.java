package io.swagger.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger Server", 
        version = "3.0.0", 
        description = "API системы реляционно-ситуационного анализа текстов",
        termsOfService = "",
        contact = @Contact(email = "rexhaif.io@gmail.com"),
        license = @License(
            name = "MIT",
            url = "https://mit-license.org/"
        )
    )
)
public class Bootstrap {
}
