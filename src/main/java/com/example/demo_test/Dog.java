package com.example.demo_test;

public class Dog extends Animal {

	String color; // null
	int age = 2; // 年齡預設 2

	public Dog(String color, int age) {
		this.color = color;
		this.age = age;
	}

	public Dog(String name) {
		super(name); // 呼叫老爸建構方法的 name 參數
	}

	public Dog() {
		
	}

	@Override
	public void move() {
		System.out.println("狗狗跑走了");
	}

	public void dogMove(Dog dog) {
		dog.move();
	}

	@Override // 重新定義 Animal 老爸的方法
	public void eat() {
		System.out.println("正在吃飼料");
	}

	@Override
	public void sleep() {
		System.out.println("睡的正香呢");
	}

	public void barking() {
		System.out.println(super.getName() + "正在叫"); // super.可以引用老爸的方法
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
