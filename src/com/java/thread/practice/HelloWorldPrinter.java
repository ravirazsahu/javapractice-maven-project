package com.java.thread.practice;

public class HelloWorldPrinter extends Thread{
	
@Override
public void run() {
	System.out.println("Hello World!"+ Thread.getAllStackTraces());
	try {
		Thread.sleep(5000);
		System.out.println("Slept for sometime");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
//	public void run() {
//		
//	}
}
