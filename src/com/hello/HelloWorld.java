package com.hello;

public class HelloWorld {
	private String username;
	private String password;
	
	public void setUsername(String username) {
		System.out.println("set userName");
		this.username = username;
	}
	
	public void setPassword(String password) {
		System.out.println("set password");
		this.password = password;
	}

	
	public void hello() {
		System.out.println("hello:" + username);
	}
	
	// 必须要有一个无参的构造器
	public HelloWorld() {
		System.out.println("HelloWorld constructor....");
	}
	
}
