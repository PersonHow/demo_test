package com.example.demo_test;

public class GrandSon extends Son{
	
	public GrandSon() {
		
	}
	
	public GrandSon(String name) {
		super(name);
	}
	public void dancing() {
		System.out.println(super.getName() + " 正在跳舞");
	}

}
