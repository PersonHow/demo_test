package com.example.demo_test;

public class Animal {
	private String name; // protected 權限也是可以的，對於繼承會較方便許多
//	private String ani;

	public Animal() { // 沒有參數的建構方法，都要記得填
		System.out.println("你老爸還是你老爸");
	}

	public Animal(String name) {
		this.name = name;
	}

	public void move() {
		System.out.println("動物移動中");
	}
	
	public void aniMove(Animal ani) {
		ani.move();
	}
	
	public void eat() {
		System.out.println(this.name + "正在吃東西"); // 利用 this 確認它是捕捉到第 4 行的 name
	}

	public void sleep() {
		System.out.println(this.name + "正在睡覺");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
