package com.example.homework;


//@SpringBootApplication
public class homework_0308 {

	public static void main(String[] args) {
// 		HAS-A 聚合關係 (雇用傭兵)
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassC c = new ClassC();
//		ClassA A = new ClassA(c);
		System.out.println(a.getC().getCity());
		System.out.println(b.getC().getCity());
//=============================================================
//		Class D 的屬性有包含 Class C 以及 String num
//		屬性 num 有預設值
//		屬性的權限皆為 private
//		程式執行時，透過 Class D 印出 Class C 和 Class D 的屬性預設值
		System.out.println("=========HomeWork=======");
		ClassD D = new ClassD();
		System.out.println(D.getC().getCity());
		System.out.println(D.getNum());
//=============================================================
		//自我嘗試
		System.out.println("=======自我練習 (繼承) =========");
		ClassE E = new ClassE();
		E.setFamliyNum("十三");
		System.out.println(E.getFamliyNum());
		System.out.println(E.getConutry());
//=============================================================
		//觀念釐清
		ClassA A = new ClassA();
		ClassC C = new ClassC();
		System.out.println(A);  //<--------印出來是記憶體位置
		System.out.println(C);  //<--------印出來是記憶體位置
		System.out.println(A.getC());  //<--------印出來是記憶體位置 
		System.out.println(A.getC().getFamliy());  //<--------印出來是null

	}

}
