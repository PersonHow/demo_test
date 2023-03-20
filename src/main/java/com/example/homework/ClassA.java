package com.example.homework;

public class ClassA {

	private int money;
	private int sex;
	private ClassC C = new ClassC();

	public ClassA() {

	}

	public ClassA(ClassC C) {
		this.C = C;
	}
	public ClassA(int money, int sex, ClassC C) {
		this.money = money;
		this.sex = sex;
		this.C = C;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public ClassC getC() {
		return C;
	}

	public void setC(ClassC c) {
		C = c;
	}

}
