package com.ibm.bank;

public class BalanceException extends Exception {
	public BalanceException() {

	}

	public BalanceException(String msg) {
		super(msg);
		//System.out.println("Insufficient balance");
	}

}
