package com.java.thread.practice;

public class HelloWorldPrinter extends Thread{
	
@Override
public void run() {
	System.out.println("Hello World!"+ Thread.getAllStackTraces());
}
//	public void run() {
//		
//	}
}
