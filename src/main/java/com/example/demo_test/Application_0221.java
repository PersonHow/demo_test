package com.example.demo_test;

//@SpringBootApplication
public class Application_0221 {

	public static void main(String[] args) {
		int x = 120;
		int z = x * 8 * 300;

		System.out.println("一年可賺的錢：" + z );
		// z 會跟著自動轉換字串
		
//  Practice
		int y;
		int s;
		y = 9000 * 12;
		s = z - y;
		
		System.out.println("一年的花費： " + y);
		System.out.println("一年可存的錢：" + s);
		System.out.printf("一年的開銷： %d%n" + "與一年存的錢：%d%n",y,s);
		
//	小駝峰命名(變數) 例如 hourlySalary
//  前單字 hourly 第一個字母小寫，後單字 Salary 第一個字母大寫
		int hourlySalary   = 120;                          // 每小時薪資
		int monthlyFee     = 9000;                         // 每月的花費
		int annualSalary   = hourlySalary * 8 * 300;       // 每年的所得
		int annualFee      = monthlyFee * 12;              // 每年的花費
		int annualSavings  = annualSalary - annualFee;     // 每年可存的錢
		
		System.out.println("一年可儲存： " + annualSavings);
		
		System.out.println("Println 輸出長這樣");
		System.out.println("Println 輸出長這樣");
		System.out.printf("Printf 輸出長這樣");
		System.out.printf("Printf 輸出長這樣");
	}

}
