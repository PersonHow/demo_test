package com.example.homework;

import java.util.Random;
import java.util.Scanner;

//@SpringBootApplication
public class homework_0306 {

	public static void main(String[] args) {
//    猜數字,使用 Math.random() 產生範圍 1-99 之間的一個數字
//    使用者猜數字，若產生50，猜 80 則顯示 1-80，猜 25 則顯示 25-80...
//		Random i = new Random();
//		Scanner scan = new Scanner(System.in);
//		int boom = i.nextInt(99)+1, bigRan = 99, smallRan = 1;
//		for (;;) {
//			System.out.print("給我一個beat: ");
//			int num = scan.nextInt();
//			if( num == boom) {
//				System.out.println("Boom");
//				break;
//			}
//			else if(num > bigRan || num < smallRan){
//				System.out.println("兄弟再想想");
//				System.out.printf("數字介於 %d - %d 之間\n", smallRan, bigRan);
//			}
//			else if (num > boom ) {
//				System.out.printf("數字介於%d - %d 之間\n", smallRan, num);
//				bigRan = num;
//			}
//			else if (num < boom) {
//				System.out.printf("數字介於%d - %d 之間\n", num, bigRan);
//				smallRan = num;
//			}
//		}
//		
//===========================================================================================
		// 樂透
		Scanner scan1 = new Scanner(System.in);
		int lottery[] = new int[50];
		System.out.print("請輸入要購買幾張大樂透彩票：");
		int num = scan1.nextInt();

		for (int l = 1; l <= num; l++) {
			System.out.printf("%d：\t", l); // 輸出第幾組大樂透資料
			for (int n = 1; n <= 49; n++) { // 重製陣列裡面的號碼，一定要放裡面
				lottery[n] = n;
			}
			int count = 1;
			while (count <= 6) { // 一組大樂透有 6 個數字
				int lNum = (int) (Math.random() * (49 - 1 + 1)) + 1;
				if (lottery[lNum] == 0) { // 如果是 0 表示數字已經產生過
					continue;
				} else {
					System.out.printf("%d  \t", lNum); // 印出新的大樂透數字
					lottery[lNum] = 0; // 與上述 if == 0 相呼應
					count++;
				}
			}
			int sNum = (int) (Math.random() * (8 - 1 + 1)) + 1;
			System.out.printf("特別號:%d", sNum);
			System.out.println("");
		}

//========================================================================

	}

}
