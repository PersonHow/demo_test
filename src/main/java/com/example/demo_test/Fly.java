package com.example.demo_test;

public interface Fly {
	
	public void flying();
	
	public default void uping() {
		System.out.println("往上飛");
	}
}
