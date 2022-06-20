package com.ibm.ex3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyLife {
	
	@Test
	public void testexample3()
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex3ctx.xml");
		
		ctx.getBean(MyLife.class);
		
		((AbstractApplicationContext) ctx).close();
	}

}
