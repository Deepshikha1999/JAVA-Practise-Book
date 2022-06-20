package com.ibm.an5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {

	@Bean("ex")
	public ExchangeService getService()
	{
		System.out.println("Contacting exchange server...");
		return new ExchangeService();
	}
}
