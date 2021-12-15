package com.ibm.shop;

public class Product implements Comparable<Product>{
	private String name;
	private double price;
	private int stock;
	public Product(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public Product() {
		//super();
	}
	
	public void print()
	{
		System.out.print("Product name: "+name+" ;");
		System.out.print("\tProduct Price: "+price+" ;");
		System.out.println("\tStock available: "+this.getStock());
	}
	
	public int getStock() {
		return stock;
	}
	
	public String getName() {
		return name;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return getName().compareTo(o.getName());
	}
}
