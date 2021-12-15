package com.ibm.currencyconverter;

public class TestCurrencyConverter {

	public static void main(String[] args) {
		//Currency source = new Currency("USD", 80.5);
		//Currency target = new Currency("INR", 1 / source.getCurrency_init());

		//System.out.println(source.getName() + " to " + target.getName() + ": "
				//+ CurrencyConverter.convert(500, source, target) + " " + target.getName());
		//System.out.println(target.getName() + " to " + source.getName() + ": "
				//+ CurrencyConverter.convert(500, target, source) + " " + source.getName());
		Dollar d=new Dollar();
		Rupee r=new Rupee();
		CurrencyConverter cc=new CurrencyConverter();
		
		System.out.println(cc.convert(500,d,r));
		System.out.println(cc.convert(500,r,d));
		
		System.out.println(cc.convert(500,new Rupee(),new Pound()));
	}

}
