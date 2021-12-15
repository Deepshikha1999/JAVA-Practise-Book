package com.ibm.currencyconverter;

public class CurrencyConverter {

	public static double convert(double amount, CurrencyValue source, CurrencyValue target) {
		//amount = amount * target.getCurrency_init();
		amount=amount*(target.value()/source.value());
		return amount;
	}

}
