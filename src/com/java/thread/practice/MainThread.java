package com.java.thread.practice;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("main here "+Thread.currentThread().toString());
		HelloWorldPrinter th=new HelloWorldPrinter();
		th.start();
	}
}
