package com.openclassrooms.api;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

/*
    @Bean
    public GroupedOpenApi api() {
        return createDefaultGroupedOpenApi("api", "/api/**");
    }



    private GroupedOpenApi createDefaultGroupedOpenApi(String groupName, String pathsToMatch) {
        return GroupedOpenApi.builder()
                .group(groupName)
                .pathsToMatch(pathsToMatch)

               // .addOperationCustomizer(new OpenApiPreAuthorizeCustomizer())
                .build();
    }
*/
    /*
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().components(new Components()).info(new Info().title("Spring Open API example")
                .description("A simple example about using Spring and Open API").version("1.0.0"));
    }
    */



    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("API OpenAPI ")
                .description("Test API for Employee")
                .version("2.0")
                .contact(apiContact())
                .license(apiLicence());
    }

    private License apiLicence() {
        return new License()
                .name("MIT Licence")
                .url("https://localhost:9000/swagger-ui/index.html");
    }

    private Contact apiContact() {
        return new Contact()
                .name("Olivier Dellaroma")
                .email("odellaoma@gmail.com");
    }


}
