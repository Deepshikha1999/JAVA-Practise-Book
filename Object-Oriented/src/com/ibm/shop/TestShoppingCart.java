package com.ibm.shop;

public class TestShoppingCart {

	public static void main(String[] args) {
		ShoppingCart sp=new ShoppingCart();
		Product p1=new Product("Iphone 12",54000,4);
		Product p2=new Product("Ipad Mini",39000,5);
		
		try {
			sp.addtoCart(p1);
		} catch (ShopException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sp.addtoCart(p2);
		} catch (ShopException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sp.addtoCart(new Product("iWatch 7",32000,3));
		} catch (ShopException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sp.addtoCart(p1);
		//sp.addtoCart(p2);
		
		sp.checkout();
	}

}
