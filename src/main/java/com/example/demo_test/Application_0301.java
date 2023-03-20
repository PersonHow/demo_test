package com.example.demo_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@SpringBootApplication
public class Application_0301 {

	public static void main(String[] args) {
		// if & else 的愛恨鳩葛, if...else勢必為擇一進行,
		// 執行完會跳出準則,若準則外又重新宣告,答案會以最新宣告為主
		int a = 10, b = 0;
		if ( a > 5) {
			b = 11;
		}
		else if ( a > 15) {
			b = 15;
		}
		else {
			b = 30;
		}   // 已離開準則
		b = 35;  // 準則外又另行宣告
		System.out.println(b);
//	  =============================================================
	    // 陣列開始
		// 計算一周平均溫度
		double average, total = 0; // average 平均溫度, total 溫度總和
		double [] arrayX = new double [7]; // 陣列宣告方式
//		double [] arrayX = {25,21,20,22,26,29,30};  // 另類的宣告陣列，有這行不用上面那行
		System.out.println("貨櫃這麼大：" + arrayX.length);  // .length，表示貨櫃大小多大
		arrayX[0]=25;
		arrayX[1]=22;
		arrayX[2]=24;
		arrayX[3]=20;
		arrayX[4]=26;
		arrayX[5]=21;
		arrayX[6]=22;
		int arrayXlength = arrayX.length;
		for ( int i = 0; i < arrayXlength; i++) {  // 這邊要注意 i 變數的大小要符合陣列貨櫃的大小
			total += arrayX[i];
		}
		average = total / arrayXlength;
		 // %5.2f，.2f取餘數第二位，%5是給予完整輸出S的格數，整數大於格數就完整顯示
		System.out.printf("平均溫度：%5.2f\n" , average); 
//	  =============================================================		
		
		// 隨機輸入數字(最多五個)加總平均，並輸出每個數字以及最後的平均
		double numArray []= new double [5];
		double average1, total1 = 0;
		int count1 = 0,  number;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < numArray.length; i++) {
		System.out.print("輸入數字：");
		// numArray[i] = scan.nextInt()   這方式寫法也可以，不過填 0 時也會把 0 放進陣列
		number= scan.nextInt();
		if( number == 0) {
			System.out.println("結束");
			break;
		}
		numArray [i] = number;
		total1 += numArray[i];
		count1++;
		}
//		if(count1 == 0) {
//			System.out.println("平均："+ 0 );
//		}else {
//			average1 = total1 / count1;
//		System.out.println("平均是：" + average1);
//		}
		 if( count1 != 0 ){
         average1 = total1 / count1;
         System.out.println( "平均是：" + average1 );
        	}
		 
//	   =============================================================		 
		 // 當時就挺突然的來了 List
		 List <Integer> listTest = new ArrayList<>();
		 listTest.add(22);
		 listTest.add(20);
		 listTest.add(20);
		 listTest.add(30);
		 int total2 = 0;
		 for (int it = 0; it < listTest.size(); it++) {
			  System.out.printf("listTest %d ： %d\n", it, listTest.get(it));
			 total2 += listTest.get(it);
		 }
		 int average2 = total2 / listTest.size();
		 System.out.println(average2);
		 System.out.println("-----------------");
		 
//   ===================================================================
		 //foreach
		  for(Integer yyy : listTest) {
			  System.out.println(yyy);
		  }
//     =============================================================		 
		 // List 計算每周平均溫度
		 System.out.println("--------------------");
		 List <Integer>  weekAverage= new ArrayList<>();
//		 List <Double> weekAverage = new ArrayList<>();
		 weekAverage.add(25);
		 weekAverage.add(22);
		 weekAverage.add(24);
		 weekAverage.add(20);
		 weekAverage.add(26);
		 weekAverage.add(21);
		 weekAverage.add(22);
		 double total3 = 0;      // int 與 double 會影響答案的小數點呈現
		 double average3 = 0;
		 for (int wk = 0; wk < weekAverage.size(); wk++) {
			 total3 += weekAverage.get(wk);
		 }
		 average3 = total3 / weekAverage.size();
		 System.out.printf("平均溫度：%5.2f\n", average3);
		 
//   ===============================================================
		 // 輸入最多五個數字計算平均，輸入 0 即停止輸入
		 int count2 = 0, circle = 0, rule;
		 double average4 = 0;
		 Scanner scan1 = new Scanner(System.in);
		 List <Integer> fiveNum = new ArrayList<>();
		
		 for (int f = 0; f < 5; f++) {
			 System.out.print("數字給我：");
			 rule = scan1.nextInt();
			 if(rule == 0) {
				 System.out.println("直接結束");
				 break;
			 }
			 else 
				fiveNum.add(rule);
				count2 += fiveNum.get(f);
				 circle++;	
		 }
		 if ( circle != 0 ) {
		 average4 = count2 / circle;
//		 System.out.print(fiveNum.toString());                 方法 1
//		 System.out.print("以輸入的數字：");              以下三行為方法2
//		 for(int p2 =0; p2 <fiveNum.size(); p2++) {
//			 System.out.print(fiveNum.get(p2) +" " );
//		 }
		 for ( Integer item : fiveNum) {                   // foreach 為方法3
			 System.out.print(item+" ");
		 }
		 System.out.println("\nList 方式平均計算：" + average4);
		 }
	}
}
