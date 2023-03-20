package com.example.demo_test;

import java.util.Scanner;

//@SpringBootApplication
public class Application_0224 {

	public static void main(String[] args) {
		// 巢狀迴圈練習 99乘法表
//		int i, j;
//		for ( i = 1; i < 10; i++) {
//			for(j = 1; j < 10; j++) {
//				System.out.printf("%d*%d =%2d ", i,j,(i*j));
//			}
//			System.out.println(" "); //換行輸出
//		}
		
		// while迴圈
//		int i = 1, sum = 0;
//		while (i<=10) {
//		//	i++; //會印出11
//			System.out.println("i:"+ i);
//			sum += i;
//			System.out.println("sum:"+sum);
//			i++; //不會印出11
//		}
		
		// while迴圈 9*9乘法表
		int x = 1, y ;
		while( x<=9 ) {
			y = 1;
			while( y<=9) {
//				System.out.print(x+"*"+y+" ="+(x*y)+" ");
				System.out.printf("%d*%d =%2d ", x, y, (x*y));
				y++;
			}
			System.out.println("");
			x++;
		}
		
		
		// do... while迴圈
		int d =1, sum =0;
		do {
			sum+=d;
			System.out.print("d:"+ d );
			System.out.println(" sum:"+sum);
			d++;
		}while(d<=10);
		
		
		// break & continue
		for ( int bk = 1; bk<=10; bk++) {
			if(bk  == 5) {
				break;
//				continue;
			}
			System.out.println("bk:"+bk);
		}
		
		// continue 計算奇數和
		
		}
	}
