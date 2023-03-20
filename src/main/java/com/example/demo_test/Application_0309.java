package com.example.demo_test;

//@SpringBootApplication
public class Application_0309 {

	public static void main(String[] args) {
// 重新定義的啦
		Animal animal = new Animal("mino");
		animal.eat();
		animal.sleep();
		Dog dog = new Dog("pili");
		dog.eat();
		dog.sleep();
// 動態多形動茲動的啦======================
		System.out.println("=====動態多形======");// 這 part 是沒有多形的例子
		Animal ani = new Animal();
		Dog d = new Dog();
		Bird bird = new Bird();
		ani.aniMove(ani);
		d.dogMove(d);
		bird.birdMove(bird);
//=============================================================
		System.out.println("=====動態多形 Part 2=========");
		// 向上轉型，子往父轉型
		System.out.println("------向上轉型-------");  // 子類別只可以使用老爸的工具
		Animal anim = new Animal();
		Animal birdd = new Bird();
		anim.aniMove(anim);
		anim.aniMove(birdd);
		birdd.aniMove(bird);
		// 向下轉型能使用子類別的方法
//	Bird bd = (Bird)new Animal();
		System.out.println("------向下轉型-------");
		Animal biird = new Bird();
		Bird bbird = (Bird) biird;
		bbird.birdMove(bbird);
//	bd.birdMove(bd);
//================================================
		System.out.println("=====巢狀迴圈=======");
		System.out.println("----內(一般)----");
		School sc = new School();
		sc.display();
		System.out.println("----內(區域)----");
		sc.college();
		System.out.println("----內(匿名)----");
		School sch = new School() { // 宣告匿名類別及物件
			@Override
			public void moving() {   // 重新定義 School裡的 moving 方法
				System.out.println("學生跑更快了");
			}
		}; // 這個 ";" 冒號至關重要
		sch.moving();
	}

}
