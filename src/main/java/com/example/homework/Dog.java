package com.example.homework;

public class Dog implements Run{
	
	public  Dog() {
		
	}
	@Override
	public void running() {
		System.out.println("---dog---");
		Run.super.running();            //引用父介面的方法
		System.out.println("實作並重新定義");
		System.out.println("Run Like Fly");
	}
}
