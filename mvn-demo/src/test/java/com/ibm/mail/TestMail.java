package com.ibm.mail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMail {
	
	private static EMail email;
	
	@BeforeAll
	public static void setup()
	{
		email=new EMail();
	}
	
	@Test
	public void testMail()
	{
		email.conn( "deepshikha01081999@gmail.com");
	}

}
