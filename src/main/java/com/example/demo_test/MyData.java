package com.example.demo_test;

public class MyData<T> {      // 加上<> 變成泛型類別
	private T obj;
	public MyData(){
		
	}
	
	public void setobj(T obj) {
		this.obj = obj;
	}
	
	public T getobj() {
		return this.obj;
	}
	
	public static <AAA> void outputArray(AAA[] elements) {
		for (AAA ele:elements) {
			System.out.println(ele);
		}
	}

}
