package com.example.practice;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class pra_March02 {

	public static void main(String[] args) {
		//泡泡排序練習
		int tmp;
		int x , y ;
		int [] xx = {19, 17, 13, 11, 7, 5, 3, 2};
		for (x = 0 ; x < (xx.length-1); x++) {  // .length-1 是為了不要多跑一次排序
			for (y = 0; y <(xx.length-x-1); y++) {   //.length-1 是因為比較索引值+1，這邊要-1才會平衡，-x是為了節省比較次數
				if ( xx[y] > xx[y+1] ) {
					tmp = xx[y];
					xx[y] = xx[y+1];
					xx[y+1] = tmp;
				}
			}
			System.out.printf("\n第%d排序結果 ", (x+1));
			for(Integer yy : xx) {
				System.out.printf("%d ",yy);
			}
		}
			
//===========================================================================
		int [][] scs = {{1, 2, 3},{4, 5, 6}};
		System.out.println("\n===================");
		for ( int i = 0; i < scs.length; i++) {
			for(int j =0; j< scs[i].length;j++) {
				System.out.printf("x[%d][%d] = %d\t", i,j,scs[i][j]);
			}System.out.println("");
		}
//============================================================================
		//計算1~10奇數合 & 把偶數放進list
		int sum = 0;
		List <Integer> twoNum = new ArrayList<>();
		for ( int num = 1; num <= 10; num++) {
			if(num % 2 == 0) {
				twoNum.add(num);
				continue;
			}
			sum += num;
		}
		System.out.println("奇數合：" + sum);
		System.out.println("偶數List");
		for (int sum2:twoNum) {
			System.out.print(sum2+" ");
		}
//============================================================================
		
	}

}
