package com.ibm.an4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageProcess {
	
	@Test
	public void testMessage()
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("an4ctx.xml");
		MessageProcessor mp=(MessageProcessor)ctx.getBean("mp");
		mp.process("sms", "7646940815", "Hello dear");
		mp.process("email", "7089761129", "get lost");
		mp.process("wap", "7089761129", "i ll think about it");
	}

}
