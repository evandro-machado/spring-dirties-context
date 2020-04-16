package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:child-context.properties")
public class ChildContext
{

	@Bean
	public String childBean() {
		System.out.println();
		System.out.println("Child context started");
		System.out.println();
		return "";
	}

}
