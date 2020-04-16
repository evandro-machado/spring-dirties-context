package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:parent-context.properties")
public class ParentContext
{

	@Bean
	public String parentBean() {
		System.out.println();
		System.out.println("Parent context started");
		System.out.println();
		return "";
	}

}
