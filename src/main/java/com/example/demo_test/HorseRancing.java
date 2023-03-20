package com.example.demo_test;

public class HorseRancing extends Thread {
// 循序漸進的設計但無關執行緒

	public HorseRancing() {

	}

	public HorseRancing(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + "正在跑第" + i + "圈");
		}
	}
}
