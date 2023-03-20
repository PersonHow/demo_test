package com.example.demo_test;


//@SpringBootApplication
public class Application_0315 {

	public static void main(String[] args) {
//	MultiThread t = new MultiThread();
//	t.start();
//	System.out.println("來者何人：" + t.getName()); 
//=======================================================
//	System.out.println("---繼承並多執行緒---");
//	HorseRancing h1 = new HorseRancing("No.1");
//	HorseRancing h2 = new HorseRancing("No.2");
//	h1.start();
//	h2.start();
//=======================================================
//	System.out.println("---實作Runnable---");
//	HorseRanceT ht1 = new HorseRanceT("No.3");
//	HorseRanceT ht2 = new HorseRanceT("No.4");
//	Thread t1 = new Thread(ht1);
//	Thread t2 = new Thread(ht2);
//	t1.start();
//	t2.start();
//=======================================================
	System.out.println("---Race Condition 競賽條件 or 競賽危害---");
	SellTicket st = new SellTicket();
	Thread ts1 = new Thread(st,"童工一號");
	Thread ts2 = new Thread(st,"童工二號");
	ts1.start();
	ts2.start();
//========================================================
	}

}
