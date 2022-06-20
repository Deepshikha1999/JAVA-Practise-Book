package com.ibm.service;

import java.util.List;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

public interface PassengerTicketService {

	int addPassenger(Passenger p,int pnr);
	
	int addTicket(Ticket t);
	
	boolean removePassenger(int id);
	
	boolean deleteTicket(int pnr);
	
	boolean updatePassenger(Passenger p);
	
	//boolean updateTicket(int pnr);
	
	//List<Ticket> fetchByPNR(int pnr);
	
	List<Passenger> fetchAll();
	
	List<Passenger> fetchById(int id);
}
