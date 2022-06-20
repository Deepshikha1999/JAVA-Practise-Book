package com.ibm.an1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	
	@Test
	public void testMessage()
	{
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("an1ctx.xml");
		Hello h=(Hello)appCtx.getBean("hi");
		System.out.println("Message: "+h.getMessage());
		
	}
	
	
}
