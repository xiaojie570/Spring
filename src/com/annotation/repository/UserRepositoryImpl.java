package com.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired(required=false)
	private TestObject testObject;
	
	@Override
	public void save() {
		System.out.println("UserRepository's save() ");
		System.out.println(testObject);
	}

}
