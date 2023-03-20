package com.example.demo_test;

public class MultiThread extends Thread{
	
	public MultiThread() {
		
	}
	
	@Override
	public void run() {
		System.out.println("Thread 運行中...");
	}

}
