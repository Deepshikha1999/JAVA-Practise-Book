package com.ibm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMaths {
	private static Maths maths;
	
	@BeforeAll
	public static void setup()
	{
		maths=new Maths();
	}
	
	@Test
	public void testAdd()
	{
		assertEquals(10,maths.add(5, 5));
	}
	
	@Test
	public void testSubs()
	{
		assertEquals(10,maths.sub(20,10));
	}
	
	@Test
	public void testDiv()
	{
		assertEquals(3,maths.div(9, 3));
	}
	
	@Test
	public void testZeroDiv()
	{
		assertThrows(ArithmeticException.class,()->maths.div(2, 0));
	}

}
