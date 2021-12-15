package com.ibm.bank;

public abstract class Accounts implements Bank{
	private int acctno;
	private String holder;
	protected double balance;
	/*//Application constants
	public static final int INIT_ACCOUNT_NO=1001;
	public static final double MIN_SAVINGS_BAL=1000;
	public static final double INIT_CURRENT_BAL=5000;
	public static final double MIN_CURRENT_BAL=0;
	public static final double OVERDRAFT_LIMIT=10000;*/
	
	private static int counter;
	
	//Executes at the time of class loading...
	static {//static initializer block, consider as constructor for static memeber
		System.out.println("Account class loader");
		counter=INIT_ACCOUNT_NO;
	}

	public Accounts(String holder,double balance) {
		super();
		this.acctno = counter++;
		this.holder = holder;
		this.balance = balance;
	}

	public Accounts() {

	}

	public void summary() {
		System.out.println("A/C no.: " + acctno);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public void deposit(double amount) {
		//balance += amount;
	}

	//public abstract void withdraw(double amount);
}
