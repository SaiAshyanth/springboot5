package com.diseaseDatabase.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Disease Database",
				version="1.1.2",
				description="Diseases Details and Project",
				contact=@Contact(
						name="SAI ASHYANTH",
						email="ashyanth2004@gmail.com"
						)
				)	
		)
public class DiseaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiseaseApplication.class, args);
	}

}
