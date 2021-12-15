
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {
	private ArrayList<String> basket;
	
	@BeforeAll
	public static void setup() {
		System.out.println("Executes before all test cases");
	}
	
	@AfterAll
	public static void teardown() {
		System.out.println("Executes after all test cases");
	}
	
	@BeforeEach
	public void setupEach() {
		basket=new ArrayList<>();
		basket.add("cherry");
		System.out.println("Executes before each test case");
	}
	
	@AfterEach
	public void teardownEach() {
		basket=null;
		System.out.println("Executes after each test case");
	}
	
	@Test
	@Disabled
	public void testEmptyBasket() {
		System.out.println("Testing empty basket");
		assertTrue(basket.isEmpty());
	}

	@Test
	public void testOneItem() {
		basket.add("Apple");
		System.out.println("testing basket with 1 item");
		assertEquals(2,basket.size());
	}
}
