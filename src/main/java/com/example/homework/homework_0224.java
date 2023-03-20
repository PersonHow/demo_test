package com.example.homework;

import java.util.Scanner;

//@SpringBootApplication
public class homework_0224 {

	public static void main(String[] args) {
		 // 猜數字 ( 1~ 99) , 直到猜到為止,  假設答案 45
		 // 第一次猜 80 , 顯示 1 ~ 80  繼續猜
		 // 第二次猜 30 , 顯示 30 ~ 80 繼續猜
		 // 以此類推...
		final int ansNum = 45 ;
		int guessNum,  numBigran = 99, numSmallran = 1 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("回家功課猜數字 ( 1 ~ 99 )");
		for ( ; ; ) {
			 System.out.print("請猜: ");
			 guessNum = scan.nextInt();
			 if( guessNum > numBigran  ||  guessNum < numSmallran ) { // 防呆, "||"這個
				 System.out.println("兄弟冷靜一些");
				 System.out.printf("答案介於 %d ~ %d, 繼續猜\n", numSmallran, numBigran);
			 }
			 else if( guessNum < ansNum) {        // 猜的數字比答案小
				 System.out.printf("答案介於 %d ~ %d, 繼續猜\n", guessNum, numBigran );
				 numSmallran = guessNum;
			 }
			 else if (guessNum > ansNum) {   // 猜的數字比答案大
				 System.out.printf("答案介於 %d ~ %d, 繼續猜\n", numSmallran, guessNum );
				 numBigran = guessNum;
			 }
			 else if( guessNum == ansNum) {
				 System.out.println("您猜到了，您牛逼!!!");
				 break;
			 }
			  
		 }
		
//		// 上述猜數字 ( 有次數版本 )
//		
//		final int Boom = 70;
//		int guess , conut ,bigRan = 99, smallRan = 1;
//		Scanner scan1 = new Scanner(System.in);
//		System.out.println("回家功課猜數字(次數版本)");
//			for ( conut = 1; conut < 6 ; conut++ ) {
//				 System.out.print("請猜: ");
//				 guess = scan.nextInt();
//				 if( guess < Boom) {  // 猜的數字比答案小
//					 System.out.printf("答案介於 %d ~ %d, 繼續猜\n", guess, bigRan );
//					 smallRan = guess;
//				 }
//				 else if (guess > Boom) {  // 猜的數字比答案大
//					 System.out.printf("答案介於 %d ~ %d, 繼續猜\n", smallRan, guess );
//					 bigRan = guess;
//				 }
//				 if( guess == Boom) {
//					 System.out.println("您猜到了，您牛逼!!!");
//					 break;
//				 }
//			 }System.out.println("沒有次數了");
		
		
	}

}
