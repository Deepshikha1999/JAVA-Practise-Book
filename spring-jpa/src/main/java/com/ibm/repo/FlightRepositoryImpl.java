package com.ibm.repo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Flight;

@Repository
public class FlightRepositoryImpl implements FlightRepository {

	@PersistenceContext
	private EntityManager em;

	public String save(Flight f) {
		em.persist(f);
		return f.getCode();
	}

	public Flight fetch(String code) {
		return em.find(Flight.class, code);
	}

	public List<Flight> fetchAll() {
		Query que = em.createQuery("from Flight");
		return que.getResultList();
	}

	public boolean delete(String code) {
		Flight f = em.find(Flight.class, code);
		em.remove(f);
		return true;
	}

	public boolean update(Flight f) {
		em.merge(f);
		return false;
	}

	public List<Flight> fetchByCarrier(String carrier) {
		Query que = em.createNamedQuery("bycarrier");
		que.setParameter("car", carrier);
		return que.getResultList();
	}

	public List<Flight> fetchByRoute(String src, String dest) {
		Query que = em.createNamedQuery("byroute");
		que.setParameter("src", src);
		que.setParameter("dest", dest);
		return que.getResultList();
	}

}
