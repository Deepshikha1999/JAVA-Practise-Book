package com.ibm.an4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.stereotype.Repository;

@Repository("mp")
public class MessageProcessor{
	@Autowired
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

}
