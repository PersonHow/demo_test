package com.example.demo_test;

import java.util.Scanner;

//@SpringBootApplication
public class Application_0314 {

	public static void main(String[] args) {
		// 台灣手機號碼 10 碼, ex:0922-569-887，加上符號 "-" 是 12碼
		// 每一碼範圍是 0 ~ 9
		// 如何判斷 12 碼為台灣手機號碼格式

		String phoneNum0 = "0958-632-108";
		String phoneNum1 = "Java is Good";
		String phoneNum2 = "1616-16161616";
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d"; // "\d" 代表0 ~ 9數字，在多加 "\" 跳脫，使 JAVA 能區分
//		String pattern = "\\d{4}-\\d{3}-\\d{3}"; 			 // 用大括弧 "{}" 取代上述正規表達式重複的部分
		String pattern = "\\d{4}(-\\d{3}){2}"; 				 // 擅用小括弧 "()" 做分組處理 
		System.out.println("0 號特工格式 " + phoneNum0.matches(pattern)); // matches = 運用正規表達式來判斷
		System.out.println("1 號探員格式 " + phoneNum1.matches(pattern)); 
		System.out.println("2 號傭兵格式 " + phoneNum2.matches(pattern)); 
		String phoneNum3 = "(02)-55879788";
		String pattern1 = "\\(\\d{2}\\)-\\d{8}"; // 要判斷括弧，要記得加上跳脫符號 "\\" 
		System.out.println("3 號間諜格式 " + phoneNum3.matches(pattern1));
		String phoneNum4 = "02-88746523";
		String pattern2 = "(\\d{2})-\\{8}";   // 若 "()" 沒使用跳脫符號，等同於做分組處理，對應 17 行
		System.out.println("4 號殺手格式 " + phoneNum4.matches(pattern2));
		String test= "\\";   // 字串 = \ ，另一個 \ 是跳脫符號
		String pt = "\\\\";  // 判斷字串前方加上 \\ 
		System.out.println(test.matches(pt));
//===============================================
// 可有可無字串好兄弟
		System.out.println("---關於可有可無大小事---");
		String J1 = "Johnson";
		String J2 = "Johnnason";
		String J3 = "Johnnanason";
		String J4 = "John";
//		String pee ="John((na)?son)";   // 用 "?" 表示 "na" 是可有可無的字串，可重複 0 ~ 1  次
//		String pee ="John(na)*son";     // 用 "*" 表示 "na" 是可有可無的字串，可重複 0 ~ 多 次
		String pee ="John(na)+son";     // 用 "+" 表示 "na" 是一定要有甚至超多的字串，可重複 1 ~ 多 次
		System.out.println("J1 :" + J1.matches(pee));  //這個若使用 "+" 會出現 false
		System.out.println("J2 :" + J2.matches(pee));
		System.out.println("J3 :" + J3.matches(pee));
		System.out.println("J4 :" + J4.matches(pee));  //這個只有John 沒有 son 所以會錯
		
//================================================
		// 比對市內電話，市區碼有 2-4 碼 並0開頭，中間用 "-" 連接，後面有 7-8 碼
		System.out.println("---This is CountryGuy---");
		String num1 = "083-6235784";
		String num2 = "06-88888888";
		String num3 = "0836-2586693";
		String num4 = "066-456789";
		String countryNum = "0(\\d){1,3}-(\\d){7,8}";     // "\\d"代表 0~9 間的整數
		System.out.println("num1:" + num1.matches(countryNum));
		System.out.println("num2:" + num2.matches(countryNum) + " 後面有巴拿馬");
		System.out.println("num3:" + num3.matches(countryNum) + " 前面有四爺後面有七辣");
		System.out.println("num4:" + num4.matches(countryNum) + " 後面只有六碼");
//================================================
		// 奇怪的規矩
		System.out.println("---Stage Rule---");
		String stagew = "AAA";
		String staged = "12345";
		String stages = "   ";
		String WW = "\\W+";     // 除了數字、字母、底線字元都行
		String ww = "\\w+";     // 數字、字母、底線任一字元都行
		String www = "AAA\\w+"; // AAA 後面還要有數字、字母、底線任一字元才會 true
		String SS = "\\S+";     // 除了空白、tab、換行、換頁、定位都行
		String ss = "\\s+";     // 空白、tab、換行、換頁、定位任一都行
		String DD= "\\D+";      // 除了整數 0 ~ 9都行
		String dd = "\\d+";     // 整數 0 ~ 9 都行
		System.out.println("WW: "+ stagew.matches(WW) + " ww: " + stagew.matches(ww) + " www :" + stagew.matches(www));
		System.out.println("SS: "+ stages.matches(SS) + " ss: " + stages.matches(ss));
		System.out.println("DD: "+ staged.matches(DD) + " dd: " + staged.matches(dd));
		String stageWild1 = "hat";
		String stageWild2 = " at";
		String stageWild3 = "at";
		String stageWild4 = "flat";
		String wildCard = ".at";  //可以是除了換行字元的任一字元，但只限一個字元
		System.out.println("hat: " + stageWild1.matches(wildCard));
		System.out.println(" at: " + stageWild2.matches(wildCard));
		System.out.println("at: " + stageWild3.matches(wildCard));
		System.out.println("flat: "+ stageWild4.matches(wildCard));
	}

}
