package io.redspark.candidatos.config.swagger

import org.springframework.util.StringUtils
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry

class SwaggerUiWebMvcConfigurer(private val baseUrl: String) : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        val baseUrl = StringUtils.trimTrailingCharacter(baseUrl, '/')
        registry.addResourceHandler("$baseUrl/swagger-ui/**")
            .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/")
            .resourceChain(false)
    }

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("$baseUrl/swagger-ui/")
            .setViewName("forward:$baseUrl/swagger-ui/index.html")
    }
}