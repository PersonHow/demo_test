package com.example.demo_test;


//@SpringBootApplication
public class Application_0306 {

	public static void main(String[] args) {
//		Dog iDog = new Dog("Mini","blue",2);
//		System.out.println(iDog.age +" "+iDog.color+" "+iDog.name);
		Bank bank = new Bank("QOQ");
		bank.get_Balance();
		bank.setBalance(1000);
		bank.get_Balance();               // 定義時無 static
		Bank.get_Balance1("AOA", 200);    // 定義方法時有 static 的差異
		System.out.println("======PErsOn=======");
		Person p1 = new Person("董卓","TUNG",91,"你家隔壁");
		System.out.print(p1.getAdress());
		System.out.print(" "+p1.getAge());
		System.out.print(" "+p1.getName());
		System.out.print(" "+p1.getId());
		Person p2 = new Person("董平","DONG",22);
		System.out.print("\n"+p2.getAge());
		System.out.print(" "+p2.getName());
		System.out.print(" "+p2.getId()+"\n");
		System.out.println("=======StATic=========");
		System.out.println((bank.number = 20));
		System.out.println("=========MatH=========");
		System.out.println(Math.PI);
		int dixx [] = new int[10];
		for (int i =0 ; i< 10; i++) {
			dixx[i] = (int)(Math.random() * (6 -1 +1)) +1;
			System.out.printf("%d ",dixx[i]);
		}
	}

}
