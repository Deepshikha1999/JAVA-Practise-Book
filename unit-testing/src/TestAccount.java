import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestAccount {

	private Account acnt;
	
	@BeforeEach
	public void init() {
		acnt=new Account(1000);
	}
	
	@Test
	public void testWithdraw() throws BalanceException {
		assertEquals(500, acnt.withdrawl(500));
	}
	
	@Test
	public void testInvalidWithdraw() {
		assertThrows(BalanceException.class,()->acnt.withdrawl(2000));
	}
	
	@Test
	public void testNegativeWithdraw() {
		assertThrows(NumberFormatException.class,()->acnt.withdrawl(-100));
	}
	
	@Test
	@Disabled
	public void testDeposit()
	{
		assertEquals(1000.0,acnt.deposit(1000.0));
	}
	
	@Test
	public void testNegativeDeposit()
	{
		assertThrows(NumberFormatException.class,()->acnt.deposit(-100));
	}
}
