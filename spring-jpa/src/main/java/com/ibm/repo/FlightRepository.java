package com.ibm.repo;

import java.util.List;

import com.ibm.entity.Flight;

public interface FlightRepository {

	String save(Flight f);
	
	Flight fetch(String code);
	
	List<Flight> fetchAll();
	
	boolean delete(String code);
	
	boolean update(Flight f);
	
	List<Flight> fetchByCarrier(String carrier);
	
	List<Flight> fetchByRoute(String source, String destiny);
}
