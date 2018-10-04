package com.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * ʵ��������������Ҫ�������������ٵ��ù�����ʵ������������bean��ʵ��
 * @author lenovo
 *
 */
public class InstanceCarFactory {
	private Map<String,Car> cars = null;
	
	public InstanceCarFactory() {
		cars = new HashMap<>();
		cars.put("Audi", new Car("Audi",30000));
		cars.put("Ford", new Car("Ford",30000));
	}
	
	public Car getCar(String brand) {
		return cars.get(brand);
	}
}
