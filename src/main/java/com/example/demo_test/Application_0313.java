package com.example.demo_test;


//@SpringBootApplication
public class Application_0313 {

	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		airplane.flying();
		airplane.uping();
		System.out.println("===By myself===");
		Bird1 bird1 = new Bird1();
		bird1.flying();
		bird1.uping();
	}

}
