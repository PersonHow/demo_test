package com.example.homework;

//@SpringBootApplication
public class homework_0314 {

	public static void main(String[] args) {
		// 身份證字號檢查
		// 10碼、第一個為英文字母(大小寫都行)
		// 一定要正規表達式
		String idCard1 = "S236955302";
		String idCard2 = "b136558743";
		String check = "([A-Za-z])+(\\d){9}"; // [A-Za-z] <=> [A-Z]|[a-z] 相同意思，但第一個較常用
		System.out.println("idCard1: " + idCard1.matches(check));
		System.out.println("idCard2: " + idCard2.matches(check));
//=====================================================
		// 比對市內電話，市區碼有 2-4 碼 並0開頭，剩下3碼不得為0，中間用 "-" 連接，後面有 7-8 碼
		System.out.println("---市話---");
		String homeNum1 = "06-6648741";
		String homeNum2 = "049-7896322";
		String homeNum3 = "0836-75229831";
		String homeNum4 = "0007-65548870";
		String numCheck = "0[1-9]{1,3}-\\d{7,8}";
		System.out.println("homeNum1: " + homeNum1.matches(numCheck));
		System.out.println("homeNum2: " + homeNum2.matches(numCheck));
		System.out.println("homeNum3: " + homeNum3.matches(numCheck));
		System.out.println("homeNum4: " + homeNum4.matches(numCheck));
//======================================================
		// 身份證字號檢查
		// 10碼、第一個為英文字母(大小寫都行)
		// 英文字母後面接的第一個數字 1 或 2
		// 一定要正規表達式
		// 題目二(排除六都英文字母A, B, D, E, F, H)
		// 回家試試看 "//w" 寫在最前面
		System.out.println("------題目一-----");
		String idNum1 = "S211587996";
		String idNum2 = "B155687422";
		String idNum3 = "b012345678";
		String idCheck = "([A-Za-z])[1-2]\\d{8}";
		System.out.println("idNum1: " + idNum1.matches(idCheck));
		System.out.println("idNum2: " + idNum2.matches(idCheck));
		System.out.println("idNum3: " + idNum3.matches(idCheck));
		
		System.out.println("------題目二-----");
		String idNum4 = "~112345678";
		String idCheck2 = "([^abABD-Fd-fHh\\W\\d_])[1-2]\\d{8}"; 
//		String idCheck2 = "([\\w^abABD-Fd-fHh\\d_])[1-2]\\d{8}"; 
		System.out.println("idNum1: " + idNum1.matches(idCheck2));
		System.out.println("idNum2: " + idNum2.matches(idCheck2));
		System.out.println("idNum4: " + idNum4.matches(idCheck2));
	}

}
