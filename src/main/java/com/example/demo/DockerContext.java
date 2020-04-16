package com.example.demo;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:docker-context.properties")
public class DockerContext
{

	@Bean
	public String dockerBean() {
		System.out.println();
		System.out.println("Docker context started");
		System.out.println();
		return "";
	}

}
