package com.example.demo_test;

import java.util.Scanner;

//@SpringBootApplication
public class Application_0222 {

	public static void main(String[] args) {
		int x, y;
		x = y = 10;
		System.out.println("起始值 x：" + x + " 起始值 y：" + y );
		System.out.println("++放前面：" + ++x );
		System.out.println("++放後面：" + y++);
		System.out.println("運算完的x："+ x +" 運算完的y：" + y);
		
						
		//三元運算練習
		int a, b, c, d, e, f;
		a = 100;
		b = 50;
		c = a > b? 77:88;  //如果 a > b , c = 77 , otherwise c = 88;
		d = 20;
		e = 30;
		f = d < e? 66:55; //如果 d < e , f =66 , otherwise f = 55;
		System.out.println(c);
		System.out.println(f);
		
		
		//scanner物件練習
		int x1, x2 ;
		String x3, x4;
		char x5 ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("請輸入兩個整數(數字間用空白間隔)：");
		x1 = scan.nextInt();
		x2 = scan.nextInt();
		System.out.println("您輸入的第一個數字為：" + x1);
		System.out.println("您輸入的第二個數字為：" + x2);
		System.out.println("數字加總為      ：" + (x1+x2));
		System.out.print("請輸入ID：");
		x3 = scan.next();
		System.out.printf("嗨! %s Welcome!", x3 );
		Scanner scan1 = new Scanner(System.in);
		System.out.print("\n請輸入ID：");
		x4 = scan1.nextLine();
		System.out.printf("嗨! %s Welcome!", x4 );
		System.out.print("\n請輸入字串:");
		x5 = scan.next().charAt(1);
		System.out.println("你輸入的值第2個字元是："+ x5 );
		
		//math practice
		int     q1 =  9/5;
		double  q2 = 9d/5;  //沒補上d，答案會是1.0
		float   q3 = 9f/5;  //沒補上f，答案會是1.0
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
	}

}
		
