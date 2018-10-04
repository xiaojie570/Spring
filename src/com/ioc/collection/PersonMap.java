package com.ioc.collection;


import java.util.Map;

import com.ioc.Car;

public class PersonMap {
	private String name;
	private Map<String,Car> cars;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", cars=" + cars + ", age=" + age + "]";
	}
}
