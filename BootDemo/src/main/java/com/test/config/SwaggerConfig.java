package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration    // 配置注解，自动在本类上下文加载一些环境变量信息
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.test.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("springboot利用swagger构建api文档")
				.description("简单优雅的restfun风格，http://blog.csdn.net/saytime")
				.termsOfServiceUrl("http://blog.csdn.net/saytime")
				.version("1.0")
				.build();
	}
	/*
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        
        super.addResourceHandlers(registry);
    }
	
	/**
	      * 配置servlet处理
	      */
	/*
	     @Override
	     public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	         configurer.enable();
	     }
	     */
}