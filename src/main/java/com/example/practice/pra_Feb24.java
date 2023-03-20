package com.example.practice;

import java.util.Scanner;

//@SpringBootApplication
public class pra_Feb24 {

	public static void main(String[] args) {
		 // 巢狀迴圈練習 99乘法表
		int i, j;
		System.out.println("助教題目第二題 99乘法表");
		for ( i = 1; i < 10; i++) {
			for(j = 1; j < 10; j++) {
				System.out.printf("%d*%d =%2d ", i,j,(i*j));
			}
			System.out.println(" "); //換行輸出
		}
		
		//助教題目第一題
		int k, p, ans = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("助教題目第一題");
		System.out.print("請輸入預計算的階層數字： ");
		k = scan.nextInt();
//      另一種解
//		for (p = 1; p <= k; p++) { 
//			ans =  ans * p;			}
		for (p = k; p > 0; p--) {
			ans =  ans * p;		
		}
		System.out.println(ans);
		
		//助教題目第三題 10 之後的 20 個質數
//		int maxValue = 0, pn2, pn1;
//		System.out.println("質數");
//		for ( pn1 = 10;; pn1++) {              //pn1 = 10 ;;兩個分號中間不加條件式等同無限大
//			for( pn2 = 2; pn2 < pn1; pn2++) {
//				if( pn1 % pn2 == 0) {
//					break;
//				}
//			}
//            if ( pn2 == pn1) {
//				System.out.print(" "+pn1);
//				maxValue++;
//		    }
//			if ( maxValue == 20) { //只印出20個
//				 break;
//			 }
//			   }
		
		// 質數講解 (較好理解)
		int x, y, count = 0; //被除數, 除數, 質數出現的次數
		System.out.println("助教題目第三題");
		for( x = 10;; x++) {
			for ( y = 2; y<=x; y++) {
		// 如果 x 可以被 y 整除,而且 x 不等於 y (如果 y 在等於x之前被整除，那x就不是質數)
				if ( x % y == 0 && x != y) {
					break;
				}else if (x % y == 0 && x == y) {
					System.out.print(x+" ");
					count++;
				}
			}if(count == 20) {
				break;
			}
		}
		
		
		//1~10 奇數和(continue)
		int sn1, sumsn1 = 0;
		for( sn1 =1; sn1 <10; sn1++) {
			if( sn1  % 2 == 1) {
				sumsn1 +=sn1;
			}else {
				continue;
			}
			
		}
		System.out.println("\n------{1~10 基數和}-------");
		System.out.println("sumsn1:" + sumsn1);
		
		// 猜數字練習
		int guessNum, ansNum = 50 ;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("------{猜數字}-------");
		for ( ;;) {  // 這樣也能是無窮迴圈
			System.out.print("請輸入要猜的數字: ");
			guessNum = scan2.nextInt();
			if( guessNum == ansNum) {
				System.out.println("猜到了, 爆炸!!!");
				break;
			}
			else {
				System.out.println("猜錯了請繼續猜");
			}
		}
		// 猜數字練習2( 有次數版本 )
		final int ansNum2 = 45;   // 用 final 設定答案(常數), 使他不可變
		int guessNum2, circle = 1; //  設定要猜的數字以及能猜幾次
		Scanner scan3 = new Scanner(System.in);
		System.out.println("----{猜數字 2 }----");
		while (circle <= 5) { // 最多只能猜五次
			System.out.print("請輸入要猜數字: ");
			guessNum2 = scan3.nextInt();
		if( guessNum2 == ansNum2 ) {   
			System.out.println("猜到了，爆炸!!!");
			break;
		}
		if( circle == 5) { // 第五次還沒猜出來
			System.out.println("次數用完了，可惜");
		}else {
			System.out.println("請再猜一次");
		}
		 circle ++;
      }
	     
		// 雞兔同籠 今有雞兔同籠，上有35個頭，下有100隻腳，試問雞兔各有幾隻?
		// 雞1個頭2隻腳，兔子1個頭4隻腳
		int chicken =0, rabbit ;
		while(true) {
			rabbit = 35 - chicken; // 先假設兔子有 35 隻
			if(2 * chicken + 4 *rabbit == 100) {
				System.out.printf("雞有 %d 隻, 兔子有 %d 隻", chicken, rabbit);
				break;
			}chicken += 1;
		}
		
	}
}

			
			
		
	

