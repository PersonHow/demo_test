package com.example.demo_test;

//@SpringBootApplication
public class Application_0303 {

	public static void main(String[] args) {
		Dog isDog = new Dog();
//		isDog.name = "Bili";
		isDog.color = "black";
		isDog.age = 5;
		System.out.println("================");
//		System.out.println(isDog.name);
		System.out.println(isDog.age);
		System.out.println("================");
		isDog.setName("BiLiBiLi");
		System.out.println(isDog.getName());
//====================================================
		Dog myDog = new Dog();
		Dog youDog = new Dog();
		System.out.println("=======dog&dog======");
		System.out.println(myDog == youDog);
		myDog.setName("GGG"); // 相對於下方String s = "AAA";
		youDog.setName("GGG");
		System.out.println(myDog.getName() == youDog.getName());
//====================================================
		String str = new String ("AAA"); // 只要使用到 new 去實例化，就會分配到不同記憶體空間
		String str1 = new String ("AAA");// 所以是不同的物件
		System.out.println("=======AAA======");
		System.out.println(str == str1);  // 不同記憶體空間
		String s = "AAA";
		String s1 = "AAA";
		System.out.println(s == s1);  // 都指向同一個物件
//====================================================
	// 遞迴呼叫
		System.out.println("5的階層結果 = " + factorial(5));
		
		System.out.println(grade(60));
	}   // public static void main的大括弧

// 方法設計放在public static void main ...的大括弧外
// 遞迴方法設計
public static int factorial(int n) {
	if( n == 1) {
		return 1;
	}
		return (n * factorial(n-1));


}
//====================================================


//====================================================
//課本習題 6
public static char grade(int n) {
	switch( n / 10) {
	case 10:
		return 'A';
	case 9:
		return 'A';
	case 8:
		return 'B';
	case 7:
		return 'C';
	case 6:
		return 'D';
	default:
		return 'F';
	}
}
}

