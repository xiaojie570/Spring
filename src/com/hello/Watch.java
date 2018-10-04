package com.hello;

public class Watch {
	private String brand;
	private String corp;
	private double price;
	private int test;
	public Watch(String brand, String corp, double price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	
	
	public Watch(String brand, String corp, int test) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.test = test;
	}



	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", corp=" + corp + ", price=" + price + ", test=" + test + "]";
	}
}
