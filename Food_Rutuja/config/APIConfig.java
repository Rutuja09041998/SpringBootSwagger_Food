package com.example.Food_Rutuja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class APIConfig {

	@Bean
	public OpenAPI Food() {
		return new OpenAPI()
				.info(new Info().title("Food API")
						.description("REST API for CRUD operation")
						.version("v0.0.1")
						.license(new License().name("Apache 2.0"))
						);	
	}
	
}
