package com.ibm.currencyconverter;

public class Currency {

	private String name;
	private double currency_init;

	public Currency(String name, double currency_init) {
		super();
		this.name = name;
		this.currency_init = currency_init;
	}

	public void setCurrency_init(double currency_init) {
		this.currency_init = currency_init;
	}

	public String getName() {
		return name;
	}

	public double getCurrency_init() {
		return currency_init;
	}
}
