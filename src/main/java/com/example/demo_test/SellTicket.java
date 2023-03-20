package com.example.demo_test;

public class SellTicket implements Runnable {
	private int tickets = 10;

	public SellTicket() {

	}

	@Override
	public void run() {// synchronized 鎖住共享資源直到執行緒完工才會釋放資源
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (tickets >= 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					System.out.println(Thread.currentThread().getName() 
										+ "剩下" + tickets-- + "張");
				} else {
					System.out.println(Thread.currentThread().getName()   // Threa這行在於取得名字
														+"回家睡覺");
				}
			}
		}
	}
}
