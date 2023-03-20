package com.example.demo_test;

public class Bank {
	private String name;
	private int balance; //只在這類別允許設定
	public static int number;    //使 0306 第26行可以直接設定
	
	public Bank () {
		
	}
	public Bank(String name) {
		this.name = name;
		this.balance = 0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void get_Balance() {
		System.out.println(this.name+" 目前存款" + this.balance);
	}
	public static void get_Balance1(String name, int balance) {
		System.out.println(name + " 現在有" + balance);
	}
}
