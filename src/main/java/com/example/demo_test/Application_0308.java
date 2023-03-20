package com.example.demo_test;


//@SpringBootApplication
public class Application_0308 {

	public static void main(String[] args) {
		Animal animal = new Animal("Mino");
		animal.eat();
		animal.sleep();
		System.out.println("================");
		Dog dog = new Dog("Pino");
		dog.eat();
		dog.sleep();
		dog.barking();
		System.out.println("================");
		Bird bird = new Bird("Bino");
		bird.eat();
		bird.sleep();
		bird.flying();
//=================================================
		System.out.println("======奇妙老爹======");
		Father fa = new Father("Daddy");
		fa.walk();
		Son son  = new Son("Boy");
		son.walk();
		son.playboll();
		Daughter daughter = new Daughter("Girl");
		daughter.walk();
		daughter.shopping();
		GrandSon grandson = new GrandSon("Boys");
		grandson.walk();
		grandson.playboll();
		grandson.dancing();
//=================================================
		
	}

}
