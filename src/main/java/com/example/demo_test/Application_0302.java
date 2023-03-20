package com.example.demo_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@SpringBootApplication
public class Application_0302 {

	public static void main(String[] args) {
		int [] score = {90, 58, 80, 49, 92};
		int tmp;
		System.out.printf("原始結果\n");
		for ( int sc:score) {
			System.out.printf("%d ",sc);
		}
		System.out.println("\n================");

		for(int i =0; i < (score.length-1); i++) { //-1避免多跑一次迴圈，有幾個數就跑幾個數-1
			for(int j=0; j< (score.length-1); j++) { //因應下方，.length要 -1 才不會超出陣列長度
				if(score[j]<score[j+1]) {  //這邊+1是為了比較
					tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
			System.out.printf("第 %d 次迴圈排序結果\n", (i+1));// i 從 0 開始
			for(int sc:score) {
				System.out.printf("%d ", sc);
			}
			System.out.println("");
		}
//===============================================================================================
		//Data type
		System.out.println("=======原始資料型態=======");
		int score1 = 80, x;
		x = score1;
		System.out.println("score: "+ score1 +" x:"+ x );
		System.out.println("");
		System.out.println("=======\t參照資料型態=======");
		int [] score2 = {90, 79, 92};
		System.out.println(score2);
		System.out.println(score[0]);
//===============================================================================================
		// 二維陣列
		int [][] scs = {{1, 2, 3},{4, 5, 6}};
		System.out.println("===================");
		for ( int ii = 0; ii < scs.length; ii++) {
			for(int jj =0; jj< scs[ii].length;jj++) {
				System.out.printf("x[%d][%d] = %d\t", ii,jj,scs[ii][jj]);
			}System.out.println("");
		}
//================================================================================================
		// 找因數
		List <Integer> pp = new ArrayList <>();
		Scanner scan = new Scanner(System.in);
		int p1;
		System.out.println("==================");
		System.out.print("請輸入數字：");
		p1 = scan.nextInt();
		for(int p2 = 1; p2 <= p1; p2++) {
			if( p1 % p2 == 0) {
				pp.add(p2);
			}
		}
		for ( int pwp:pp) {
			System.out.print(pwp+" ");
		}
		for(int y = 0; y < pp.size(); y++) {
			for(int z = 0 ;z < pp.size(); z++) {
				if(pp.get(y) * pp.get(z) == p1) {
					System.out.printf("\n%d * %d", pp.get(y), pp.get(z));
				}
			}
		}
//===============================================================================
		// contains 地獄
		System.out.println("\n===================");
		List <Integer> gh = new ArrayList<>();
		for(int g = 1; g <=56 ; g++) {
			for(int h = 56; h >=1; h-- ) {
				if(g * h == 56 ) {
					gh.add(g);
					gh.add(h);
				}
				if(gh.contains(g)) {  //用來判別 List 中 是否已包含數字
					break;
				}
			}
		}
		for ( int ghg:gh) {
			System.out.print(ghg+" ");
		}
		System.out.println(" ");
		for (int b = 0; b < gh.size(); b++) {
			System.out.printf("%d * %d = 56\n", gh.get(b), gh.get(b+1));
			b++;
		}
	}
	
	
}
		
		
		
	
	


