package com.example.demo_test;

import java.io.IOException;

import org.springframework.util.StringUtils;

//@SpringBootApplication
public class Application_0316 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		String name = bank.getName();
		if (name != null) {
			System.out.println(name.isEmpty());
		} else { // is mean name == null
			System.out.println(false);
		}
		System.out.println("--------------");
//=====================================================
		System.out.println("簡單的 try & catch 捕捉異常");
		int x = 5, y = 0;
		try {
			System.out.println((x / y));
		} catch (ArithmeticException e) {
//		}catch(IndexOutOfBoundsException e) {	//不同的異常錯誤捕捉
			System.out.println("除數為0的異常" + e);
		}
		;
		System.out.println("====我是分隔君====");
//======================================================
		System.out.println("多個區塊捕捉");
		try {
			System.out.println((x / y));
		} catch (ArithmeticException e) {
//		 catch(ArithmeticException | IndexOutOfBoundsException e) { 這是另一個多重區塊的寫法
			System.out.println("除數為0的異常" + e);
		} catch (Exception e) { // 老爸需擺在後面，子類別不行時幫忙收尾
			System.out.println("這邊是異常類別的老爸" + e);
		}
		System.out.println("====我是分隔君====");
//=======================================================
		String[] pwd = { "123456789", "12345678" };
		ThrowError thError = new ThrowError();
		for (int i = 0; i < pwd.length; i++) {
			try {
				thError.pwdCheck(pwd[i]);
			}catch(Exception e) {
				System.out.println("Error" + e);
//				e.printStackTrace();A
			}
		}

	}

	
}
