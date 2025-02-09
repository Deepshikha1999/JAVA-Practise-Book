package com.ibm.an3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class MyLife {
	public MyLife()
	{
		System.out.println("Default constructor");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Life-cycle init");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Life-cycle destroy");
	}

}
