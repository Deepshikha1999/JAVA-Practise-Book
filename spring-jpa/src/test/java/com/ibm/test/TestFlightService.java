package com.ibm.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Flight;
import com.ibm.service.FlightService;
import com.ibm.service.FlightServiceImpl;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:appctx.xml")
public class TestFlightService {
	
	@Autowired
	private FlightService fsri;
	
	@Test
	public void testSave()
	{
		Flight f=new Flight();
		f.setCode("ABC123");
		f.setCarrier("Airlines");
		f.setSource("Delhi");
		f.setDestiny("Mumbai");
		assertNotNull(fsri.save(f));
	}
	
	@Test
	public void fetchTest()
	{
		Flight f=fsri.fetch("ABC123");
		assertNotNull(f);
		System.out.println(f);
	}
	
	@Test
	public void testFetchAll()
	{
		List<Flight> flights=fsri.fetchAll();
		assertNotNull(flights);
		flights.forEach(System.out::println);
	}
	
	@Test
	public void testDelete()
	{
		fsri.delete("ABC123");
	}
	
	@Test
	public void testUpdate()
	{
		Flight f=new Flight();
		f.setCode("ABC123");
		f.setCarrier("Airlines");
		f.setSource("Delhi");
		f.setDestiny("Mumbai");
		fsri.update(f);
		System.out.println(f);
	}
	
	@Test
	public void testFetchByCarrier()
	{
		List<Flight> flights=fsri.fetchByCarrier("Airways");
		assertNotNull(flights);	
		flights.forEach(System.out::println);
	}
	
	@Test
	public void testFetchByRoute()
	{
		List<Flight> flights=fsri.fetchByRoute("Delhi", "Mumbai");
		assertNotNull(flights);
		flights.forEach(System.out::println);
	}
}
