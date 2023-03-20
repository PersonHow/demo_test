package com.example.demo_test;

public class Circle extends Shape{
	protected double r;
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public double area(int a) { // 會int a 是因為抽象方法的定義也有 int a 
		return Math.PI *r *r;
	}

	@Override
	public void draw() {
		System.out.println("凡事先畫個圓");
	}
}
