package com.ibm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository repo;
	
	@Transactional //only in dml operation 
	public String save(Flight f) {
		// TODO Auto-generated method stub
		return repo.save(f);
	}

	public Flight fetch(String code) {
		// TODO Auto-generated method stub
		return repo.fetch(code);
	}

	public List<Flight> fetchAll() {
		// TODO Auto-generated method stub
		return repo.fetchAll();
	}

	@Transactional
	public boolean delete(String code) {
		// TODO Auto-generated method stub
		return repo.delete(code);
	}

	@Transactional
	public boolean update(Flight f) {
		// TODO Auto-generated method stub
		return repo.update(f);
	}

	public List<Flight> fetchByCarrier(String carrier) {
		// TODO Auto-generated method stub
		return repo.fetchByCarrier(carrier);
	}

	public List<Flight> fetchByRoute(String source, String destiny) {
		// TODO Auto-generated method stub
		return repo.fetchByRoute(source,destiny);
	}

}
