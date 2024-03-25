package com.java.thread.practice;

public class HelloWordPrinter2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());

	}

}
