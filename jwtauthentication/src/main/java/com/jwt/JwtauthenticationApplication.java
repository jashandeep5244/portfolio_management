package com.jwt;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContext;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class JwtauthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtauthenticationApplication.class, args);
	}
	
	
	
	@Bean
    Docket configureSwagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.ant("/**")) 
                .apis(RequestHandlerSelectors.basePackage("com.jwt.controller")).build()
                .apiInfo(apiInfo());
    }
 
    private ApiInfo apiInfo() {
        return new ApiInfo("Jwtauthentication Api", "Sample API for Jwtauthentication", "1.0", "path/to/terms",
                new Contact("Portfolio", "http://www.google.com", "Portfolio@gmail.com"), "API License",
                "http://www.google.com", Collections.emptyList());
    }

}
