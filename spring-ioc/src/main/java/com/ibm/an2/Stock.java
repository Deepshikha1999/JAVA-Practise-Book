package com.ibm.an2;

import org.springframework.context.annotation.Bean;



public class Stock {
	
	public Stock()
	{
		System.out.println("Default Constructor");
	}
	
	private static Stock stock;
	
	@Bean(name="stk")
	public static Stock get()
	{
		System.out.println("Stock singleton");
		if(stock==null)
			stock=new Stock();
		
		return stock;
	}

}
