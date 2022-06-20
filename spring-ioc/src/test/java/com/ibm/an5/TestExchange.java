package com.ibm.an5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//test config
public class TestExchange {
	
	@Test
	public void testExchange()
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ExchangeConfig.class);
		ExchangeService ex=(ExchangeService) ctx.getBean("ex");
		ex.convert();
	}

}
