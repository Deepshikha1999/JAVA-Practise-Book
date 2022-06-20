package com.ibm.an3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyLife {
	
	@Test
	public void testexample3()
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("an3ctx.xml");
		
		ctx.getBean(MyLife.class);
		
		((AbstractApplicationContext) ctx).close();
	}

}
