package com.ibm.bank;

public class Savings extends Accounts {
	
	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
	}
	
	public void withdraw(double amount) throws BalanceException
	{
		if(amount<MIN_SAVINGS_BAL)
		{
			if(amount<0)
			throw new NumberFormatException("no negative no.");
			balance-=amount;
			System.out.println(balance);
		}
		else
		{
			throw new NumberFormatException("no negative no.");
		}
	}
	
}
