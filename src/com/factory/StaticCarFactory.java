package com.factory;

import java.util.HashMap;
import java.util.Map;


/**
 * 静态工厂方法：直接调用某一个类的静态方法就可返回bean的实例
 * @author lenovo
 *
 */
public class StaticCarFactory {
	
	private static Map<String,Car> cars = new HashMap<>();
	static {
		cars.put("Audi", new Car("Audi",30000));
		cars.put("Ford", new Car("Ford",30000));
	}
	// 静态工厂方法
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
