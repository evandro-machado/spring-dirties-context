package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication
{

	public static void main(String[] args)
	{
		//		SpringApplication.run(DemoApplication.class, args);


		new SpringApplicationBuilder()
				.parent(ParentContext.class)
				.child(ChildContext.class)
				.sibling(DockerContext.class)
				.run(args);


		//		new SpringApplicationBuilder()
		//				.parent(ParentConfig.class).web(WebApplicationType.NONE)
		//				.child(WebConfig.class).web(WebApplicationType.SERVLET)
		//				.sibling(RestConfig.class).web(WebApplicationType.SERVLET)
		//				.run(args);
		//		ConfigurableApplicationContext applicationContext  = appBuilder.run();
		//		applicationContext.setId("child2");
		//		((ConfigurableApplicationContext)applicationContext.getParent()).setId("root");
	}

}
