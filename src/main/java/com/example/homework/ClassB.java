package com.example.homework;

public class ClassB {

	private int age;
	private String name;
	private ClassC C = new ClassC ();

	public ClassB() {

	}

	public ClassB(int age, String name, ClassC C) {
		this.age = age;
		this.name = name;
		this.C = C;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClassC getC() {
		return C;
	}

	public void setC(ClassC c) {
		C = c;
	}

}
