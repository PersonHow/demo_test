package com.example.practice;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//@SpringBootApplication
public class pra_March19 {
// List數字取出運算後再放回去(固定數字版)
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8, 9, 9);
		List<Character> newList = new ArrayList<>();
		StringBuffer stbf = new StringBuffer();
		for (int f1 : numList) {  // foreach 迴圈使數字變成字串
			stbf.append(f1);
		}
		String s = new String();
		int count = 0;
		count = (Integer.parseInt(stbf.toString()) + 1);
		s = String.valueOf(count);
		for (int i = 0; i <= s.length() - 1; i++) {
			newList.add(s.charAt(i));
		}
		System.out.println(newList);

//========================================================
		// List數字取出運算後再放回去(動態輸入版)
		Scanner scan = new Scanner(System.in);
		String st22 = new String();
		String str = new String();
		String check = "\\d{1,100}"; 							//整數最少1個，最多100個
		List<Character> showList = new ArrayList<>();
		List<Character> praList = new ArrayList<>();
		for (;;) {
			System.out.println("請輸入數字");
			st22 = scan.next();
			if (st22.matches(check) == true) {  				//確保為數字
				for (int z = 0; z <= st22.length() - 1; z++) {
					showList.add(st22.charAt(z)); 				// 放入輸入的數字
				}
				System.out.println("數字目前： " + showList);
				int sum = (Integer.parseInt(st22) + 1);  		//把字串改變型態並運算
				str = String.valueOf(sum);						//運算完放入新的字串
				for (int g = 0; g <= str.length() - 1; g++) { 	//放入新的List
					praList.add(str.charAt(g));
				}
				System.out.println("運算後： " + praList);
				break;
			} else {
				System.out.println("請確認是數字");
			}
		}

	}
}
