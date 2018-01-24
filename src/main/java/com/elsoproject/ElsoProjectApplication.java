package com.elsoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;



@EnableConfigurationProperties
@PropertySources({
    @PropertySource(value = "file:${appConf}", ignoreResourceNotFound = true)
})
@SpringBootApplication
public class ElsoProjectApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ElsoProjectApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(ElsoProjectApplication.class);
    }

	
}
