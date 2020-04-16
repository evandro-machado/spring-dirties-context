package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

@SpringBootTest
@ContextConfiguration(classes = ParentContext.class)
@ContextHierarchy({@ContextConfiguration(classes = {DockerContext.class})})
//@ContextHierarchy({
//						  @ContextConfiguration(classes = DockerContext.class)
//				  })
@DirtiesContext(hierarchyMode = DirtiesContext.HierarchyMode.CURRENT_LEVEL)
public class NewTest
{

	@Test
	public void novo()
	{

		//		Mockito.when(personService.returnABC()).thenReturn("CDE");


	}
}
