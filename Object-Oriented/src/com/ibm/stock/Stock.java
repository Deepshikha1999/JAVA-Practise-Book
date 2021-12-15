package com.ibm.stock;

public class Stock implements Exchange {

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		System.out.println("get quote");
	}

	@Override
	public void viewQuote() {
		// TODO Auto-generated method stub
		System.out.println("view quote");
	}

	@Override
	public void setQuote() {
		// TODO Auto-generated method stub
		System.out.println("set quote");
	}

}
