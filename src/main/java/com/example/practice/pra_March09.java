package com.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ch.qos.logback.core.net.SyslogOutputStream;
import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

//@SpringBootApplication
public class pra_March09 {

	public static void main(String[] args) {
//		// 攝氏華氏溫度轉換
//		int celsius1, fahrenheit1;
//		Scanner scan1 = new Scanner(System.in);
//		Scanner scan2 = new Scanner(System.in);
//		System.out.print("請輸入華氏溫度：");
//		fahrenheit1 = scan1.nextInt();
//		System.out.println("轉換攝氏溫度 ：" + ((fahrenheit1 - 32) * 5 / 9));
//		System.out.print("請輸入攝氏溫度：");
//		celsius1 = scan2.nextInt();
//		celsius1 = (celsius1 * 9) / 5 + 32;
//		System.out.printf("轉換華氏溫度 ：%d\n", celsius1);

//===================================================================
//		// 0309學習 Class 套用
//		int tp1;
//		Scanner scan3 = new Scanner(System.in);
//		System.out.print("要轉換的溫度： ");
//		tp1 = scan3.nextInt();
//		Temperature tp = new Temperature(tp1, tp1);
//		System.out.println("C:" + tp.getCelsius() + " F:" + tp.getFahrenheit());
//		tp.cTraf();
//		tp.fTrac();

//===================================================================
		// 挑選要吃什麼
		List<String> foodMap = new ArrayList<>();
		foodMap.add("神武拉麵");
		foodMap.add("一品屋");
		foodMap.add("神武對面麵店");
		foodMap.add("轉角三明治");
		foodMap.add("魚耶");
		foodMap.add("轉角豬腳飯");
		foodMap.add("丹丹(有騎車)");
		foodMap.add("煎餃");
		foodMap.add("鴨肉飯");
		foodMap.add("牛肉麵");
		foodMap.add("老同學灶咖");
		int xxx = (int) (Math.random() * foodMap.size() );
		System.out.println(foodMap.get(xxx) + "["+xxx+"]");
	}

}
