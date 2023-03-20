package com.example.demo_test;

public class Bird extends Animal {
	private String name;

	public Bird() {

	}

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.println("鳥鳥跳走了");
	}
	
	public void birdMove(Bird bird) {
		bird.move();
	}
	
	public void eat() {
		System.out.println(this.name + "正在吃");
	}

	public void sleep() {
		System.out.println(this.name + "正在睡");
	}

	public void flying() {
		System.out.println(this.name + "正在飛");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
