package com.example.demo_test;

public class ThrowError {
	
	public ThrowError() {
		
	}
	
	public static void pwdCheck(String pwdStr) throws Exception { // 若要拋出 throw new 錯誤需要方法後面補上
		if(pwdStr.length()>= 5 && pwdStr.length()<=8) {
			System.out.println("密碼內容成功：" + pwdStr);
		}else {
			System.out.println("密碼內容失敗：" + pwdStr);
			throw new Exception("密碼長度不符");
		}
	}
}
