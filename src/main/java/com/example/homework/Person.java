package com.example.homework;

public class Person extends Human{
//	Person 繼承 Human
//	Person 必須要重新定義”跑”這個行為
	
	public  Person() {
		
	}
	
	@Override
	public void running() { //Human 實作 Run ，再藉由這邊重新定義
		System.out.println("---person---");
		System.out.println("繼承 Human 並重新定義");
		System.out.println("Is a Sport for Healthy");
		
	}
	
	@Override
	public void action() { //這邊是重新定義父類別
		System.out.println("This is person's action");
	}
	
	
}
