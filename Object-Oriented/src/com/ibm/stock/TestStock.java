package com.ibm.stock;

public class TestStock {
	public static void main(String[] args) {
		
		/*Holder h=tesla;
		h.viewQuote();
		System.out.println();
		
		Exchange e=tesla;
		e.getQuote();
		e.viewQuote();
		e.setQuote();
		System.out.println();
		
		Broker b=tesla;
		b.getQuote();
		b.viewQuote();*/
		
		Holder h=StockSingleton.getStock();
		Exchange ex=StockSingleton.getStock();
		Broker b=StockSingleton.getStock();
		
		System.out.println(h==b);
		System.out.println(b==ex);
	}
}
