package com.example.homework;

public class Bank {

	private int balance = 10000;     // 目前存款金額
	private int withdrawAmount = 0;   // 設定一個存錢領錢能共用的變數

	public Bank() {

	}

	public synchronized void withdraw(int amount) {
		System.out.println("領摳");
		withdrawAmount = amount;  // 這樣表示領錢的金額就能再存錢那端做比較
		while (balance < amount) {
			System.out.println("兄弟你沒錢");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
//			notify(); // 存錢備註的程式碼需要用到
		}
		balance -= amount;
		System.out.println("錢拿去");
		System.out.println("目前餘額：" + balance);
		
	}

	public synchronized void deposit(int amount) {
//		while (true) {
//			System.out.println("存錢這 part");
//			balance += amount;
//			System.out.println("已存入：" + amount);
//			System.out.println("目前餘額：" + balance);
//			System.out.println("------");
//			notify();
//			try {
//				wait();
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//			if (balance == 0) {
//				break;
//			}
//		}
		while ( balance < withdrawAmount) {   
			System.out.println("存錢這 part");
			balance += amount;
			System.out.println("已存入：" + amount);
			System.out.println("目前餘額：" + balance);
			System.out.println("------");
			notify();
		}
	}

}
