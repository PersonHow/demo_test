package com.example.practice;

import java.util.Scanner;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

//@SpringBootApplication
public class pra_March13 {

	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		airplane.flying();
// 迴文練習
		String x;
		Scanner scan = new Scanner(System.in);
		System.out.print("請輸入迴文：");
		x = scan.next();
		StringBuffer y = new StringBuffer(x);
		String xy = y.reverse().toString(); // StringBuffer.reverse 是翻轉字串, toString 回傳字串
		if (x.equals(xy)) {
			System.out.println("是迴文");
		} else {
			System.out.println("非迴文");
		}
//====================================================
		String d;
		Scanner scan1 = new Scanner(System.in);
			System.out.print("檢視迴文格式：");
			d = scan1.next();
			for (int i = 0; i < d.length(); i++) {
				if (d.charAt(i) == d.charAt(d.length() - i - 1)) {
					continue;
				} else {
					System.out.println("請輸入正確迴文格式");
					break;
				}
			}System.out.println("正確迴文格式");

	}
	
	
}
