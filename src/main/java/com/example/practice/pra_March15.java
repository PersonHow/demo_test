package com.example.practice;


//@SpringBootApplication
public class pra_March15 {
// 執行緒間的通信，Bank 練習
	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread t = new Thread(){   // 匿名類別宣告方法
			@Override
			public void run() {
				bank.withdraw(15000);
			}
		};
		t.start();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				bank.deposit(10000);
			}
		};
		t1.start();
	}

}
