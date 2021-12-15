package com.ibm.bank;

public final class AccountsFactory {
	private AccountsFactory()
	{
		//so that the class will not be instantiated
	}
	public static Bank openAccount(String holder,String actype)
	{
		Bank acnt=null;
		if(actype.equals("Savings"))
			acnt=new Savings(holder);
		else
			acnt=new Current(holder);
		
		return acnt;
	}
}//factory design method
