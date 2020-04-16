package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

@SpringBootTest
@ContextHierarchy({
						  @ContextConfiguration(classes = ChildContext.class)
				  })
	@DirtiesContext(hierarchyMode = DirtiesContext.HierarchyMode.CURRENT_LEVEL)
class DemoApplicationTests
{

	@Test
	void contextLoads()
	{
	}

}
