package com.ibm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;
import com.ibm.repo.PassengerTicketRepository;

@Service
public class PassengerTicketServiceImpl implements PassengerTicketService {

	@Autowired
	private PassengerTicketRepository repo;
	
	@Override
	@Transactional
	public int addPassenger(Passenger p, int pnr) {
		// TODO Auto-generated method stub
		return repo.addPassenger(p, pnr);
	}

	@Override
	@Transactional
	public int addTicket(Ticket t) {
		// TODO Auto-generated method stub
		return repo.addTicket(t);
	}

	@Override
	@Transactional
	public boolean removePassenger(int id) {
		// TODO Auto-generated method stub
		return repo.removePassenger(id);
	}

	@Override
	@Transactional
	public boolean deleteTicket(int pnr) {
		// TODO Auto-generated method stub
		return repo.deleteTicket(pnr);
	}

	@Override
	@Transactional
	public boolean updatePassenger(Passenger p) {
		// TODO Auto-generated method stub
		return repo.updatePassenger(p);
	}

	

	@Override
	public List<Passenger> fetchAll() {
		// TODO Auto-generated method stub
		return repo.fetchAll();
	}

	@Override
	public List<Passenger> fetchById(int id) {
		// TODO Auto-generated method stub
		return repo.fetchById(id);
	}

}
