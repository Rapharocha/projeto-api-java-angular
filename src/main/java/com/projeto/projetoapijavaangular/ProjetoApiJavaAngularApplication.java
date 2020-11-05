package com.projeto.projetoapijavaangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.projeto.projetoapijavaangular.config.property.ProjetoApiJavaAngularProperty;

@SpringBootApplication
@EnableConfigurationProperties(ProjetoApiJavaAngularProperty.class)
public class ProjetoApiJavaAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiJavaAngularApplication.class, args);
	}
	
}
