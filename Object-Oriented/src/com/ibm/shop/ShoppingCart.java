package com.ibm.shop;

import java.util.ArrayList;

public class ShoppingCart {
	//private Product[] cart;//ArrayList<String> cart
	private ArrayList<Product> cart;
	private double total;
	private int idx;
	
	public ShoppingCart()
	{
		//cart=new Product[5];
		cart=new ArrayList<Product>();
	}
	
	public void addtoCart(Product p) throws ShopException
	{
		if(p.getStock()>0) 
		{
			//cart[idx]=p;
			cart.add(p);
			//idx++;
			this.total+=p.getPrice();
			p.setStock(p.getStock()-1);
			System.out.println(p.getName()+" added to cart");
		}else
		throw new ShopException("item is not available or your cart is full");
		
	}
	
	public void checkout()
	{
		System.out.println("Product in your cart:");
		for(int i=0;i<cart.size();i++)
		{
			//cart[i].print();
			cart.get(i).print();
		}
		System.out.println("Gross total: "+this.total);
		
	}
	
}
