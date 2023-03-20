package com.example.homework;

//@SpringBootApplication
public class homework_0315 {
//重新設計 Bank 領錢相關
//	方法 deposit 裡的存款金額為 2000，存款完成後加印餘額(balance)
//	提款完成後也加印餘額(balance)
//	若是提款金額依然大餘存款金額，嘗試讓程式可以繼續執行(持續存2000)，直到可以成功提款(存款金額大於提款金額)
	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread t = new Thread() {
			@Override
			public void run() {
				bank.withdraw(20000);
			}
		};
		t.start();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				bank.deposit(2000);
			}
		};
		t1.start();
	}

}
