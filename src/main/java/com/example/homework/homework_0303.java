package com.example.homework;

import java.util.Scanner;

//@SpringBootApplication
public class homework_0303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("要顯示多少個費氏數列數字：");
		int fn = scan.nextInt();
		System.out.println("數字如下");
		int fibArray [] = new int[fn];
		for(int i = 0; i < fibArray.length; i++) {
			fibArray[i] = fib(i);
			System.out.printf("%d ",fibArray[i]);
		}
		
	}
//========================================================================
//費式數列 ( 遞迴 )， Fn = F(n-1) + F(n-2)
//遞迴的重點，每呼叫自己一次就會遞減
	
public static int fib(int f) {
	if ( f == 0) {
		return 0;
	}
	else if(f == 1 || f == 2) {
		return 1;
	}
	else {
		return (fib(f-1) + fib(f-2)) ;
	}
}
//===========================================================




}
