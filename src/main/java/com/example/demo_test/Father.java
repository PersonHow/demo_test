package com.example.demo_test;

public class Father {

	private String name;

	public Father() {

	}
	
	public Father(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println(this.name + " is wolking");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}