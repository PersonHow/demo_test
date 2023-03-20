package com.example.homework;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//@SpringBootApplication
public class homework_0302 {

	public static void main(String[] args) {
//		計算機(只做乘法運算，只輸入兩個數字)
//		使用 Scanner  可一直計算, 直到輸入 0 0 才會停止, 每做一次，列出算式和結果
		int sum = 0;
		int numOn1, numTw2;
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.print("第一題，輸入兩個數字：");
			numOn1 = scan.nextInt();
			numTw2 = scan.nextInt();
			if (numOn1 == 0 && numTw2 == 0) {
				System.out.println("結束");
				break;
			} else {
				sum = (numOn1 * numTw2);
				System.out.printf("%d * %d = %d\n", numOn1, numTw2, sum);
			}
		}

//==========================================================================================
//     計算機(只做乘法運算，指輸入兩個數字)
//     使用Scanner，可一直輸入，限制五次
//     將每次輸入的兩個數字中間用空白分隔，加入到 List (List有順序性)
//     輸入 5 次數字後，使用 for 迴圈列出全部算式，Tip: List
		int i, j, addOn = 0, t = 1;
		List<Integer> fiveNum = new ArrayList<>();
		Scanner st1 = new Scanner(System.in);
		for (int z = 0; z < 5; z++) {
			System.out.print("第二題，請輸入兩個數字：");
			i = st1.nextInt();
			j = st1.nextInt();
			if (i == 0 && j == 0) {
				System.out.println("結束");
				break;
			} else {
				fiveNum.add(i);
				fiveNum.add(j);
			}
		}
		for (int q = 0; q < fiveNum.size() - 1; q++) {
			addOn = fiveNum.get(q) * fiveNum.get(q + 1);
			System.out.printf("第%d次計算\n%d * %d = %d\n", t, fiveNum.get(q), fiveNum.get(q + 1), addOn);
			q++;
			t++;
		}

//=========================================================================================		
//		計算機(只做乘法運算，只輸入兩個數字)
//		最多 5 次, 將每次輸入的數字,加入到 List ,輸入5次數字或0 0後，
//		使用 for 迴圈列出全部的算式, Tip: 使用2維陣列
		int x, y, addOn1 = 0, v = 1, b = 0, c = 0;
		int[][] fiveNum1 = new int[5][2]; // 宣告二維陣列有五列二行
		Scanner st2 = new Scanner(System.in);
		for (int z = 0; z < 5; z++) {
			System.out.print("請輸入兩個數字：");
			x = st2.nextInt();
			y = st2.nextInt();
			if (x == 0 && y == 0) {
				System.out.println("結束");
				break;
			}
			fiveNum1[z][c] = x;
			fiveNum1[z][c + 1] = y;

		}
		for (int q = 0; q < fiveNum1.length; q++) {
			if (fiveNum1[q][b] == 0 && fiveNum1[q][b + 1] == 0) {
				break;
			}
			addOn1 = fiveNum1[q][b] * fiveNum1[q][b + 1];
			System.out.printf("第%d次計算\n%d * %d = %d\n", v, fiveNum1[q][b], fiveNum1[q][b + 1], addOn1);
			v++;
		}

	}
}
