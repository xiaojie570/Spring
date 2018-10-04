package com.ioc;

public class Car {
	private String brand;
	private String corp;
	private double price;
	private int maxSpeed;
	// 构造器只初始化三个属性
	public Car(String brand, String corp, double price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setCorp(String corp) {
		this.corp = corp;
	}


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setPrice(double price) {
		this.price = price;
	}

	
	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public Car(String brand, String corp, int maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}

	

	public Car(String brand, String corp, double price, int maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
