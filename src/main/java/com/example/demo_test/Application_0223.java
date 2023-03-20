package com.example.demo_test;

import java.util.Scanner;

//@SpringBootApplication
public class Application_0223 {

	public static void main(String[] args) {
		int age = 18, age1;
		if(age >= 18) { //判斷是否滿 18 歲， if 與 else 會擇一執行
			System.out.println("已成年!"); // age >=18 時印出
		} else {
			System.out.println("未成年!"); // age < 18 時印出
		}
		
		if(age < 18) 
			System.out.println("未成年!"); 
			System.out.println("不能買菸酒");
		
		System.out.println("已成年"); //這句在判斷句外面，所以不歸 if 管理
					
		if(!(age >= 18)) { //判斷是否滿 18 歲，!可以使判斷式相反
			System.out.println("未成年!");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("請輸入您的年齡：");
		age1 = scan.nextInt();
		if (age1 < 20 ) {
			System.out.println("你的年齡太小，要滿20歲才能購買菸酒");
		} else {
			System.out.println("歡迎購買菸酒");
		}
		
		double price;
		int age2, ticket = 100;
		Scanner scan2 = new Scanner(System.in);
		System.out.print("請輸入購票年齡：");
		age2 = scan2.nextInt();
		if( age2 >= 80 || age2 <= 6 ) {
			price = ticket * 0.2;
			System.out.println("您的票價為：" + price);
		}else if ( age2 >= 60 || age2 <= 12 ) {  // 直譯 if ( (age2 >= 7 && age2 <=12) || (age2 >=60 && age2 <=79) )
			price = ticket * 0.5;
			System.out.println("您的票價為：" + price);
		}else {
			price = ticket;
			System.out.println("您的票價為：" + price);
		}
		
		
		int score;
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Switch 敘述");
		System.out.print("請輸入成績 ( 0~99 )：");
		score = scan3.nextInt();
		switch ( score / 10) {
		 case 9 :
			System.out.println("A");
	         break;
		 case 8 :
			 System.out.println("A");
			 break;
		 case 7:
			 System.out.println("C");
			 break;
		 case 6:
			 System.out.println("D");
			 break;
		 default:
			 System.out.println("F");
			 
		 }
		 
		
		// for 迴圈
		int i, sum = 0;
		for (i = 1; i <= 10; i++) {
			System.out.print("i = " + i);
			sum = sum + i;
			System.out.println(" sum = "+ sum );
		}
		
	}
		
}


