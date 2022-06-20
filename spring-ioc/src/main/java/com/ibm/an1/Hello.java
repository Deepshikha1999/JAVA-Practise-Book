package com.ibm.an1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ibm.an4.*;

@Component("hi")
public class Hello {

	private String message;
	
	@Autowired
	@Qualifier("wap")
	private Message msg;
	
	public Hello()
	{
		System.out.println("Default constructor");
	}
	
	public Hello(String message)
	{
		this.message=message;
		System.out.println("Parameterized constructor");
	}

	public String getMessage() {
		return message;
	}

	@Value("Hello Spring")
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter method");
	}
	
}
