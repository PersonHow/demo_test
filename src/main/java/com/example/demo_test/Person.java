package com.example.demo_test;

public class Person {

	private String name ;
	private String id;
	private int age;
	private String adress;
	
	public Person() {
		
	}
	
	public Person(String name, String id, int age, String adress) { //建構方法
		this.name = name;
		this.id = id;
		this.age = age;
		this.adress = adress;
	}
	
	public Person(String name, String id, int age) {  // 建構方法
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public static void get_Person(String name, String id, int age) { // 一般方法
		System.out.println("name:"+name+"\nid:"+ id+"\nage:"+age);
	}
	
	public void getPerson1(String name,String id ,int age) {
		this.name = name;
		this.id = id;
		this.age = age;
		System.out.println("name:"+name+"\nid:"+ id+"\nage:"+age);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	

	
	
}
