package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

@Repository
public class PassengerTicketRepositoryImlp implements PassengerTicketRepository {

	@PersistenceContext
	private EntityManager em;
	@Override
	public int addPassenger(Passenger p, int pnr) {
		Ticket ticket=em.find(Ticket.class, pnr);
		p.setTicket(ticket);
		em.persist(p);
		return p.getId();
	}

	@Override
	public int addTicket(Ticket t) {
		em.persist(t);
		return t.getPnr();
	}

	@Override
	public boolean removePassenger(int id) {
		Passenger pass=em.find(Passenger.class, id);
		em.remove(pass);
		return true;
	}

	@Override
	public boolean deleteTicket(int pnr) {
		Ticket ticket=em.find(Ticket.class,pnr);
		em.remove(ticket);
		return true;
	}

	@Override
	public boolean updatePassenger(Passenger p) {
		em.merge(p);
		return true;
	}

	

	@Override
	public List<Passenger> fetchAll() {
		Query que=em.createQuery("from Passenger");
		return que.getResultList();
	}

	@Override
	public List<Passenger> fetchById(int id) {
		Query que=em.createQuery("from Passenger where id='"+id+"'");
		return que.getResultList();
	}

}
