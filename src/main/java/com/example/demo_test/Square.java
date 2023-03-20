package com.example.demo_test;

public class Square extends Shape{
	protected double r;
	public Square() {
		
	}
	
	public Square(double r) {
		this.r = r;
	}
	
	@Override
	public double area(int a) {
		return  r * a;
	}

	@Override
	public void draw() {
		System.out.println("繪一個方正");
	}
}
