package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Portfolio;
import com.ibm.entity.Share;
import com.ibm.repo.SharePortRepository;

public class TestSharePort {
	
	private static SharePortRepository repo;
	
	@BeforeAll
	public static void init()
	{
		repo=new SharePortRepository();
	}
	
	@Test
	public void testPortfolio()
	{
		Portfolio port=new Portfolio();
		port.setPortId(123);
		port.setHolder("Deepshikha");
		repo.addPort(port);
	}
	
	@Test
	public void testShare()
	{
		Share s=new Share();
		s.setStock("IBM");
		s.setQuantity(100000.0);
		repo.addShare(s, 123);
	}

}
