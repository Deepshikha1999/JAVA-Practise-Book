package com.ibm.example1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	
	@Test
	public void testMessage()
	{
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("ex1ctx.xml");
		Hello h=(Hello)appCtx.getBean("hi");
		System.out.println("Message: "+h.getMessage());
		
	}
	
	@Test
	public void testMessage2()
	{
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("ex1ctx2.xml");
		Hello h=(Hello)appCtx.getBean("hi");
		System.out.println("Message: "+h.getMessage());
		
	}

}
