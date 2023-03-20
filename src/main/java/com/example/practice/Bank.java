package com.example.practice;

public class Bank {
	private int balance = 10000;

	public Bank() {

	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("領錢");
		while( balance < amount) {
			System.out.println("你是窮鬼沒資格領錢");
			try {
				wait(); // 執行緒等待
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		balance -= amount;
		System.out.println("領錢成功");
	}
	public synchronized void deposit(int amount) {
		System.out.println("--- Deposit ---");
		System.out.println("存錢");
		balance += amount;
		System.out.println("存入成功");
		notify();						//通知等待的執行緒可進行了
	}
	
}
