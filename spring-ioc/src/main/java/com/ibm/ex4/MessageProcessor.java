package com.ibm.ex4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageProcessor implements ApplicationContextAware{
	private ApplicationContext appctx;
	
	public MessageProcessor()
	{
		System.out.println("Message process constructor");
	}
	
	public void process(String type,String to, String msg)
	{
		Message message=(Message) appctx.getBean(type);
		message.send(to, msg);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.appctx=applicationContext;	
	}
}
