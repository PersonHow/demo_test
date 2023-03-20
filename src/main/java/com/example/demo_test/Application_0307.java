package com.example.demo_test;

import java.util.ArrayList;

import org.springframework.util.StringUtils;

//@SpringBootApplication
public class Application_0307 {

	public static void main(String[] args) {
		String st = "ABC";
		String st1 = "";
		String st2 = " ";
		System.out.println("==========Blank & Empty========");
		System.out.print(st.isEmpty()+"\t"+st1.isEmpty()+"\t"+st2.isEmpty()+"\n"); // 若字串裡為空值則 true，空白不算空值
		System.out.print(st.isBlank()+"\t"+st1.isBlank()+"\t"+st2.isBlank()+"\n");      // 若字串裡為空值或是空白，就 true
//=====================================================================================
		System.out.println("\n=========has Length & Text========");
		Bank bank = new Bank();
		String name =bank.getName();
		System.out.println("name: "+name);
		System.out.println(StringUtils.hasLength(name)); // 裡面有字串長度時會印出 true
		System.out.print("hasText:"+ StringUtils.hasText(name));
		name =" ";
		System.out.println(StringUtils.hasLength(name)); // 有空白就判定成 true
		System.out.print("hasText:"+ StringUtils.hasText(name));  //有空白仍然判定為 false，因為是判斷有無字
		name = "ABC";
		System.out.println(StringUtils.hasLength(name));
		System.out.print("hasText:"+ StringUtils.hasText(name));
//=====================================================================================
		System.out.println("\n=========南臺的那幾件事========");
		String stust = "Southern Taiwan University of Science and Techology";
		System.out.println("o 字元最先出現的位置 " + "["+ stust.indexOf('o')+"]");
		System.out.println("o 字元最後出現的位置 " + "["+ stust.lastIndexOf('o')+"]");
		System.out.println("o 字元從[6]開始最先出現的位置 " + "[" + stust.indexOf('o', 6) + "]"); // 從index[6]開始往右找，包含該位置
		System.out.println("o 字元從[6]開始最後出現的位置 " + "[" + stust.lastIndexOf('o',6) + "]");//從index[6]開始往左找，包含該位置
//======================================================================================
		System.out.println("==========鴛鴦大盜===========");
		//神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗
		//計算"小龍女"出現的次數，使用 indexOf 計算搜尋字段第一次出現的索引位置
		//下一次搜尋的位置從第一次索引值+搜尋字串長度開始
		String couple = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String s = "小龍女";
		int lo = 0 ;
		int count = 0;
		for(;;) {
			lo = couple.indexOf(s , lo); // 第一次 8 , 第二次 19 , 第三次 28
			if(lo == -1) {
				System.out.println(count);
				break;
			}
			System.out.println(lo);
			lo += s.length();
			count++;
		}
		
		//老師版本
		System.out.println("========老師版本========");
		int index = 0, total = 0;
		while(true) {
			index = couple.indexOf(s,index);
			if(index != -1) {
				System.out.println("index： "+ index);
				}
			else if( index == -1) {
				break;
			}
			index += s.length();
			total++;
		}
		System.out.println(total);
		
//==================================================================
		System.out.println("========刪除跟取代=========");
		String ss = " 神鵰俠侶是楊過與小龍女的故事， 我不喜歡小龍女的甲仙， 雖然小龍女在楊過眼中是清新脫俗 ";
		System.out.println(ss.trim());   // 僅刪除字串前後空白
		System.out.println(ss.replace(" ", "s")); //取代，第一個放欲取代的字元，第二個取代後的字元
//==================================================================
		System.out.println("=======split=========");  //切字元
		String sws = "I Love U";
		String[] array = sws.split("\\s");   
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
//==================================================================	
		System.out.println("======Buffer==========");  //堆疊字元
		StringBuffer buf = new StringBuffer();
		buf.append("A");
		buf.append("B");
		buf.append("C");
		buf.append("D").append("E").append("F");
		System.out.println(buf.toString());
//==================================================================
	}
}

