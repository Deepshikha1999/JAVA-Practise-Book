package com.ibm.bank;
public class Current extends Accounts {
	private double overdraft;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, INIT_CURRENT_BAL);
		this.overdraft=OVERDRAFT_LIMIT;
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		super.summary();
		System.out.println("Overdraft: "+overdraft);
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		if(overdraft<OVERDRAFT_LIMIT && overdraft+amount>OVERDRAFT_LIMIT)
		{
			balance=(overdraft+amount)-OVERDRAFT_LIMIT;
			overdraft=OVERDRAFT_LIMIT;
		}
		else if(overdraft<OVERDRAFT_LIMIT)
		{
			overdraft=overdraft+amount;
		}
		else
		{
			balance=balance+amount;
		}
	}

	@Override
	public void withdraw(double amount)throws BalanceException {
		//super.withdraw(amount);
		if(amount<=(balance+overdraft))
		{
			if(amount<0)
				throw new NumberFormatException("no negative no.");
			else {
			if(balance-amount<MIN_CURRENT_BAL)
			{
				overdraft=overdraft+balance-amount;
			}
			else
			{
				balance=balance-amount;
			}}
		}
	}
	
	
	
}
