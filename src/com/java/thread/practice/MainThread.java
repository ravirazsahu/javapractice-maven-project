package com.java.thread.practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("main here "+Thread.currentThread().toString());
		
		ExecutorService exec=Executors.newFixedThreadPool(5);
		RandomNumberGenerator<Integer> ra1=new RandomNumberGenerator<>();
		RandomNumberGenerator<Integer> ra2=new RandomNumberGenerator<>();
		
		Future<Integer> excc=exec.submit(ra1);
		Future<Integer> excc2=exec.submit(ra2);
		
		System.out.println("sum here "+(excc.get()+excc2.get()));
		System.out.println("start here "+Thread.currentThread().getName());
//		HelloWorldPrinter th1=new HelloWorldPrinter();
//		th1.start();
//		HelloWorldPrinter th2=new HelloWorldPrinter();
//		th2.start();
	}
}
