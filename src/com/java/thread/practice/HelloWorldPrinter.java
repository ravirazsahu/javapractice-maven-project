package com.java.thread.practice;

public class HelloWorldPrinter extends Thread{
	
@Override
public void run() {
	printsimplehello();
	
}

private synchronized void printsimplehello() {
	System.out.println("Hello World! -- "+Thread.currentThread().getName());	
}


//	public void run() {
//		
//	}
}
