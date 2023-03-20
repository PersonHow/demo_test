package com.example.demo_test;

public class Daughter extends Father {

	public Daughter() {
		
	}
	
	public Daughter(String name) {
		super(name);
	}
	
	public void shopping() {
		System.out.println(super.getName() + " is shopping");
	}
}
