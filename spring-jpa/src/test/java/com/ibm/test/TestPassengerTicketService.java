package com.ibm.test;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;
import com.ibm.service.PassengerTicketService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:appctx.xml")
public class TestPassengerTicketService {

	@Autowired
	private PassengerTicketService service;
	
	@Test
	public void testAddTicket()
	{
		Ticket t=new Ticket();
		t.setDate(LocalDate.parse("2021-12-22"));
		t.setPnr(9654);
		t.setTotal(5000);
		service.addTicket(t);
		assertNotNull(t);
	}
	
	@Test
	public void testAddPassenger()
	{
		Passenger p=new Passenger();
		p.setName("Abc");
		p.setAge(12);
		p.setGender("Female");
		assertNotNull(service.addPassenger(p, 9654));
	}
	
	@Test
	@Disabled
	public void testRemovePassenger()
	{
		assertNotNull(service.removePassenger(0));
	}
	
	@Test
	public void testDeleteTicket()
	{
		assertNotNull(service.deleteTicket(9654));
	}
	
	@Test
	public void testUpdatePassenger()
	{
		Passenger p=new Passenger();
		p.setName("Deepshikha");
		p.setAge(20);
		p.setGender("Female");
		assertNotNull(service.updatePassenger(p));
	}
	
	
	@Test
	public void testAll()
	{
		List<Passenger> passes=service.fetchAll();
		assertNotNull(passes);
		passes.forEach(System.out::println);
	}
	
	@Test
	public void testIdFetch()
	{
		List<Passenger> passes=service.fetchById(11);
		assertNotNull(passes);
		passes.forEach(System.out::println);
	}
}
