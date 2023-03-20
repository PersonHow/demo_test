package com.example.homework;

import java.util.Scanner;

//@SpringBootApplication
public class homework_0222 {

	public static void main(String[] args) {
		//homework 1    攝氏華氏溫度轉換
		int celsius1,fahrenheit1;
		Scanner scan1 = new Scanner(System.in); 
		Scanner scan2 = new Scanner(System.in);
		System.out.print("請輸入華氏溫度：");
		fahrenheit1 = scan1.nextInt();
		System.out.println("轉換攝氏溫度 ：" + ((fahrenheit1-32)*5/9));
		System.out.print("請輸入攝氏溫度：");
		celsius1 = scan2.nextInt();
		celsius1 = (celsius1*9)/5+32;
		System.out.printf("轉換華氏溫度 ：%d\n", celsius1  );
		
		//homework 2  等差數列求和 
		int a1,an,sn;
		Scanner scan4 = new Scanner(System.in);
		System.out.print("請輸入預計算總和的數字範圍(兩個數字)：");
		a1 = scan4.nextInt();
		an = scan4.nextInt();
		sn = (a1+an)*an/2;
		System.out.print("總合為：" + sn);
	}

}
