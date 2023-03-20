package com.example.homework;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class homework_0301 {

	public static void main(String[] args) {
		int i , j;
		List <Integer> xxx = new ArrayList<>();
		System.out.println("20以下的質數來了"); 
// 找出質數 ==================		
		for (i = 20; i > 1; i--) {
			for(j = 2; j < i ; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if( i == j) {
				xxx.add(i);
			}	
		}
// =======================================		
		System.out.println("List裡有"+xxx.size() +"個數"); //確認有捕捉到質數
		for(Integer yyy : xxx) {        //  foreach 
			System.out.printf("%d ", yyy);
		}
		
	}
}

