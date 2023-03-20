package com.example.demo_test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//@SpringBootApplication
public class Application_0310 {

	public static void main(String[] args) {
		System.out.println("====抽象類別 第一彈====");
		Circle cir = new Circle();
		cir.draw();
		Square squ = new Square();
		squ.draw();
//=========================================
		System.out.println("===抽象方法與子類別===");
		cir.r = 6;
		squ.r = 5;
		System.out.println("面積"+cir.area(8));
		System.out.println("面積"+squ.area(6));
//=========================================
		System.out.println("===燒串與八寶===");
		String str ="123";
		Integer x = Integer.valueOf(str);
		int y = Integer.parseInt(str);
		System.out.println("x:"+ x +"\ny:"+ y);
		System.out.println("================");
		String i = "AA";
		String ii = "AC";
		System.out.println(i.compareTo(ii));
//=========================================
		System.out.println("===時間管理局===");
		Date date = new Date();
		System.out.println(date.getTime());  // 取得 date 的 "毫秒" (13位數)
		// 1秒 = 1000 毫秒
		Date date1 = new Date(1678432799);
		System.out.println(date1);
		LocalDate locat = LocalDate.now();
		System.out.println(locat);//預設格式 yyyy-mm-dd
//==========================================
		System.out.println("----Formatter----");
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMdd");
		String forstr = today.format(formatter);
		System.out.println(forstr);
	}
}
