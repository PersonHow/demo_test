package com.example.demo_test;

public class School {

	public School() {

	}

//     一般內部類別
	private class Motto { // 只作用在 School 底下
		private String name = "我大哥";

		public void printInfo() { // 仍然被包含在 School 類別裡，所以設定 Private 可以被使用
			System.out.println(this.name + "上課睡覺");
		}
	}

	public void display() {
		Motto meobj = new Motto();
		meobj.printInfo();
	}

//  區域內部類別
	public void college() { // School類別裡的方法
		int student = 4000;
		class Mis { // 在方法裡建立一個類別
			public int getNum() {
				return student;
			}
		}
		Mis inner = new Mis();
		System.out.println("學生人數 " + inner.getNum());
	}

//  匿名內部類別
	public void moving() {
		System.out.println("學生都跑走了");
	}

}
