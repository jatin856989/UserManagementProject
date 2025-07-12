package com.user.config;


import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI userManagementOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("User Management System API")
                    .description("Spring Boot REST API for User Management with JWT Security")
                    .version("1.0.0")
                    .contact(new Contact()
                            .name("Jatin Bansal")
                            .email("your.email@example.com")
                    )
                );
    }
}

