package com.spring.bluewalnut.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfiguration {
	
	@Bean
	public Docket newsApiAll() {
		return new Docket(DocumentationType.SWAGGER_2)
				.consumes(getConsumeContentType())
				.produces(getproduceContentType())
				.groupName("baroPay REST service")
				.apiInfo(apiInfo())
				.select()
				.paths(PathSelectors.ant("/api/**"))
				.build();
	}
	
	public Set<String> getConsumeContentType() {
		Set<String> consumes = new HashSet<String>();
		consumes.add("application/json");
		return consumes;
	}
	
	public Set<String> getproduceContentType() {
		Set<String> produces = new HashSet<>();
		produces.add("application/json");
		return produces;
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
                .title("baroPay API 입니다.")
                .description("baroPay API 서비스입니다. API를 통해 결제를 요청합니다.")
                .contact(new Contact("home Page", "http://baropay.co.kr", ""))
                .license("Apache License Version 2.0")
                .licenseUrl("https://spring.io/")
                .version("1.0")
                .build();
	}
	

}
