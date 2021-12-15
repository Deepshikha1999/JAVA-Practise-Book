package com.ibm.bank;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accounts a1=new Accounts("Deepshikha",50000);
		//a1.summary();
		
		/*a1.deposit(10000);
		a1.summary();
		
		a1.withdraw(25000);
		a1.summary();
		
		a1.withdraw(40000);
		
		Savings s=new Savings("Deep");
		s.withdrawl(500);*/
		
		/*Current cr=new Current("Deep");
		cr.summary();
		
		cr.withdraw(3000);
		cr.summary();
		
		cr.withdraw(5000);
		cr.summary();
		
		cr.deposit(2000);
		cr.summary();
		
		cr.deposit(4000);
		cr.summary();
		
		Accounts a=cr;
		a.deposit(2000);
		a.withdraw(1000);*/
		
		//AccountsFactory af=new AccountsFactory();
		
		Bank a1=AccountsFactory.openAccount("Deepshikha","Savings");
		//a1.deposit(2000);
		try {
			a1.withdraw(500);
		} catch (BalanceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println(e1);
			e1.getMessage();
		}
		a1.summary();
		
		Bank cr=AccountsFactory.openAccount("Deep", "Current");
		cr.summary();
		
		try {
			cr.withdraw(1000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cr.summary();
		
		/*cr.withdraw(5000);
		cr.summary();
		
		cr.deposit(2000);
		cr.summary();
		
		cr.deposit(4000);
		cr.summary();*/
	}

}
