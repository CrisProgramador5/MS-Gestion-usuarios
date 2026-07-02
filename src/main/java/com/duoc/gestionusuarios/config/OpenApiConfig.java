package com.duoc.gestionusuarios.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI gestionUsuariosAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Microservicio Gestión de Usuarios")
                        .description("API REST para la gestión de usuarios")
                        .version("1.0"));
    }
}