package com.example.demo_test;

import java.util.*;

//@SpringBootApplication
public class Application_0320 {
// 泛型方法
	public static void main(String[] args) {
		MyData<Integer> m = new MyData<Integer>();
		m.setobj(10);
		System.out.println(m.getobj());
		MyData<Double> d = new MyData<Double>();
		d.setobj(111.0);
		System.out.println(d.getobj());
		MyData<String> st = new MyData<String>();
		st.setobj("String is here");
		System.out.println(st.getobj());
		MyData<Bank> bk = new MyData<Bank>(); // 宣告裡面是物件
		bk.setobj(new Bank()); // 所以裡面也要是物件
		System.out.println(bk.getobj());

		Integer[] intArray = { 1, 2, 3, 4, 5 }; // 須注意前方宣告型態要大寫
		MyData.outputArray(intArray);

//=======================================
		// List介面
		// 最左邊象徵接口
		List<String> conutry = new ArrayList<>();

		conutry.add("倫敦");
		conutry.add("香港");
		conutry.add("鎌倉");
		System.out.println("----foreach----");
		for (String item : conutry) {
			System.out.println(item);
		}
		System.out.println("----Interator----");
		//Iterator物件的練習，如還有元素itr.hasNext會傳回 true
		Iterator<String> itr = conutry.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Lambda
		System.out.println("----Lambda----");
		conutry.forEach(item -> {
			System.out.println(item);
		});
	}

}
