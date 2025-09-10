package com.mailson.pereira.kotlin.project.template.configuration.openai

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@OpenAPIDefinition
class OpenAPIConfiguration {
    @Bean
    fun openAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Mailson Fernando Pereira - Kotlin API Project Template")
                    .version("v1")
                    .description("Kotlin API Project Template")
            )
    }
}