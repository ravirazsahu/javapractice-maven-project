package com.java.thread.practice;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("main here "+Thread.currentThread().toString());
		HelloWorldPrinter th=new HelloWorldPrinter();
		HelloWordPrinter2 hpr1=new HelloWordPrinter2();
		Thread  th1=new Thread(hpr1);
		
//		1. How to execute 2nd thread after completion of first thread?
//		Answer: In Java, we can use the ‘join()’ method to wait for the current thread to complete and start the next thread.
		try {
			th.start();
			th.join();
			th1.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
