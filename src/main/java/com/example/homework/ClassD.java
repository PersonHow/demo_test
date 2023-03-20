package com.example.homework;

public class ClassD {

	private String num = "NummuN";
	private ClassC C = new ClassC();
	
	public ClassD() {
		
	}
	
	public ClassD(String num, ClassC C) {
		this.num = num;
		this.C = C;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public ClassC getC() {
		return C;
	}

	public void setC(ClassC c) {
		C = c;
	}
	
}
