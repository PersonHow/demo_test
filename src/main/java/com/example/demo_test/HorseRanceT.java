package com.example.demo_test;

public class HorseRanceT  implements Runnable{

	private String name;
	public HorseRanceT() {

	}

	public HorseRanceT(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + "跑第幾" + i + "圈");
		}
	}
}
