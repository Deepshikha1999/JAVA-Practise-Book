package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Customer;
import com.ibm.repo.CustomerRepository;

public class TestCustomer {
	
	private static CustomerRepository repo;
	
	@BeforeAll
	public static void setup()
	{
		repo=new CustomerRepository();
	}
	
	@Test
	public void testSave()
	{
		Customer c=new Customer();
		c.setCustId(144);
		c.setCustName("Polo");
		c.setCreditLimit(2000);
		c.setRating(3.5);
		
		repo.saveCustomer(c);
	}
	
	@Test
	public void testFind()
	{
		Customer c=repo.findCustomer(123);
		assertNotNull(c);
		System.out.println(c.getCustName());
	}
	
	@Test
	public void testUpdate()
	{
		//Customer tempc=repo.findCustomer(123);
		Customer c=repo.findCustomer(123);
		c.setCustName("Deeps");
		repo.updateCustomer(c);
		
	}
	
	@Test
	public void testDelete()
	{
		repo.deleteCustomer(144);
	}

}

