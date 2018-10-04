package com.factory;

import java.util.HashMap;
import java.util.Map;


/**
 * ��̬����������ֱ�ӵ���ĳһ����ľ�̬�����Ϳɷ���bean��ʵ��
 * @author lenovo
 *
 */
public class StaticCarFactory {
	
	private static Map<String,Car> cars = new HashMap<>();
	static {
		cars.put("Audi", new Car("Audi",30000));
		cars.put("Ford", new Car("Ford",30000));
	}
	// ��̬��������
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
