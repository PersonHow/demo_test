package com.example.homework;

public class Human implements Run {
	
	public  Human() {
		
	}
	
	public void action() {
		System.out.println("This is a action");
		
	}
	@Override
	public void running() {
		System.out.println("Human 實作 Run 並重新定義");
		System.out.println("Change Your Foots");
	}

}
