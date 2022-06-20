package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;
import com.ibm.repo.MovieRepository;

public class TestMovie {

	private static MovieRepository repo;
	
	@BeforeAll
	public static void init(){
		repo=new MovieRepository();
	}
	
	@Test
	public void testAddMovie()
	{
		Movie mov=new Movie();
		mov.setTitle("Harry Potter 8");
		mov.setRating(4.9);
		repo.addMovie(mov);
		
	}
	
	@Test
	public void testAddMulitplex()
	{
		Multiplex mux=new Multiplex();
		mux.setMpexId(19);
		mux.setName("Town Hall");
		repo.addMultiplex(mux);
	}
	
	@Test
	public void testAddMovieToMultiplex()
	{
		repo.addMovieToMultiplex(8, 15);
	}
	
	@Test
	public void testAddMultiplexToMovie()
	{
		repo.addMultiplextoMovie(19, 8);
	}
}
