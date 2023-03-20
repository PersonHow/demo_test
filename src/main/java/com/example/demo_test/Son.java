package com.example.demo_test;

public class Son extends Father {

	public Son() {
		
	}
	
	public Son(String name) {
		super(name);
	}
	
	public void playboll() {
		System.out.println(super.getName() + " is playing boll");
	}
}
