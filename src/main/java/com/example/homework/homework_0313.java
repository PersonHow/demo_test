package com.example.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@SpringBootApplication
public class homework_0313 {

	public static void main(String[] args) {
//		類別: Human, Person, Dog, Car
//		Person 繼承 Human
//			Human 定義 action() 方法，實作內容隨便
//			Person 要重新定義 action() 方法
//		所有類別裡面都有 “跑” 這個行為
//			必須要重新定義”跑”這個行為
//			使用介面定義行為”跑”
//		執行後，將Human, Person, Dog, Car 的行為“跑”各自列印出不同結果

//		Human human = new Human();
//		human.running();
//		human.action();
//		Person person = new Person();
//		Dog dog = new Dog();
//		person.running();
//		person.action();
//		dog.running();
//		Car car = new Car(); // Car 類別僅實作介面而已
//		car.running();
//		System.out.println("---介面練習到這裡---");
//====================================
// 		List:[1,9]
//		表示數字19
//		可以改成多個數字的List，ex:[9,9,9,9]
//		接著把 19 + 1 = 20
//		輸出 [2,0]
//		若一開始的 List 是 [9,9,9,9]; 輸出會是[1,0,0,0,0]
//      for 迴圈多半會用到數值計算
//      foreach 多數是把值逐一取出
		System.out.println("===作業的開始===");
		int x = 0;
		String y ;
		StringBuffer outstr = new StringBuffer();      // StringBuffer 有 append 能將值取出來變成堆疊成字串
		List<Integer> oneNine = Arrays.asList(9,9,9,9);    // 寫死的 List 靜態
		for(int out:oneNine) {						   // foreach 迴圈逐一把值取出來變成字串, int 對應 Integer
			outstr.append(out);						   // 用堆疊的方式
		}
		x = Integer.parseInt(outstr.toString())+1;	   // 把取出來的字串數轉成 Int 並+1，並使 Buffer 轉回字串
		y = String.valueOf(x);						   // 把加總完的數字變回字串
		List<Character> outList = new ArrayList<>();   // Character 字元 因為後面放入時是字元, 動態 List
		for ( int i = 0; i < y.length();i++) {         // 根據字串長度跑迴圈
			outList.add(y.charAt(i));				   // 用取字元的方式把值抓出來放入 List
		}
		System.out.println(outList);
	}
}

