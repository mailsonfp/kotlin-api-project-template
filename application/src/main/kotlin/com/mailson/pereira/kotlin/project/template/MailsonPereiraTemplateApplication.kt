package com.mailson.pereira.kotlin.project.template

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import java.util.TimeZone

@SpringBootApplication
@EntityScan("com.mailson.pereira.kotlin.project.template")
@OpenAPIDefinition(info=Info(
	title="Mailson Fernando Pereira - Kotlin API Project Template",
	version = "v1",
	description = "Kotlin API Project Template"))
open class MailsonPereiraTemplateApplication {
	companion object{
		@JvmStatic
		fun main(args: Array<String>) {
			TimeZone.setDefault((TimeZone.getTimeZone("GMT-3")))
			runApplication<MailsonPereiraTemplateApplication>(*args)
		}
	}
}
