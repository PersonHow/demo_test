package com.example.homework;

import java.util.Scanner;
//@SpringBootApplication
public class homework_0223 {

	public static void main(String[] args) {
		//practice 1 麥當勞時薪計算 if...else
		int hourlyWork;
		double hourlySalary = 150;
		Scanner scan = new Scanner(System.in);
		System.out.println("If...else 敘述");
		System.out.print("請輸入您這週工時：");
		hourlyWork = scan.nextInt();
		if( hourlyWork == 40 ) {
			System.out.print("您這週薪水為：" + (hourlySalary*hourlyWork));		
		}else {
			System.out.print("您這週薪水為：" + ((hourlySalary * 0.8)*hourlyWork));
			}
		
		//practice 2 麥當勞時薪計算 if...else if...else  (homework)
		int workTime;
		double hourlySalary2 = 150;
		Scanner scan2 = new Scanner(System.in);
		System.out.print("\n-----回家功課-----");
		System.out.print("\n請輸入這週工時：");
		workTime = scan2.nextInt();
		if( workTime > 50 ) {
			System.out.println("您這週時薪1.6倍，總額為："+ ((hourlySalary2* 1.6) * workTime));
			
		}else if (workTime <=50 && workTime > 40) {
			System.out.println("您這週時薪1.2倍，總額為："+ ((hourlySalary2* 1.2) * workTime));
			
		}else if (workTime == 40) {
			System.out.println("您這週時薪總額為："+ (hourlySalary2 * workTime));
		}else{
			System.out.println("您這週時薪0.8倍，總額為："+ ((hourlySalary2* 0.8) * workTime));
		}
		
		
		// practice 練習3 麥當勞時薪計算 switch敘述
		int workHourly;
		double hourlySalary3 = 150 ;
		Scanner scan3 = new Scanner(System.in);
		System.out.println("switch 敘述");
		System.out.print("請輸入工時：");
		workHourly = scan3.nextInt();
		switch( workHourly / 10 ) { // 把工時變成能判斷的各位整數
			case 0: // 0 ~ 9
			case 1: // 10 ~ 19
			case 2: // 20 ~ 29
			case 3: // 30 ~ 39
				System.out.println("薪水是：" + ((hourlySalary3 * 0.8) * workHourly));
				break;
			case 4: // 40 ~ 49
			case 5: // 50
				if( workHourly == 40 ){
				System.out.println("薪水是：" + ( hourlySalary3  * workHourly));
				break;
				}else if ( workHourly > 40 && workHourly <=50 ){ //這行要注意 && 的邏輯 有一假為一假
				System.out.println("薪水是：" + ((hourlySalary3 * 1.2) * workHourly));
				break;
			}default: // > 50
				System.out.println("薪水是：" + ((hourlySalary3 * 1.6) * workHourly));		
		}
		
		//practice 練習4 幾天後是星期幾 (homework)
		int days;
		Scanner scan4 = new Scanner(System.in);
		System.out.print("-----回家功課-----\n");
		System.out.println("今天是星期天");
		System.out.print("天數：");
		days = scan4.nextInt();
		switch ( days % 7 ) {
		case 1:
			System.out.println(days+" 天後是星期一");
			break;
		case 2:
			System.out.println(days+" 天後是星期二");
			break;
		case 3:
			System.out.println(days+" 天後是星期三");
			break;
		case 4:
			System.out.println(days+" 天後是星期四");
			break;
		case 5:
			System.out.println(days+" 天後是星期五");
			break;
		case 6:
			System.out.println(days+" 天後是星期六");
			break;
		default:
			System.out.println(days+" 天後是星期天");
		
		}
	}
}

