package com.java.thread.practice;

import java.util.Random;
import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class RandomNumberGenerator<T> implements Callable {
	
	@SuppressWarnings("unchecked")
	public T call() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("Slept");
		Random em=new Random();
		System.out.println(em.nextInt());
		return (T) Integer.valueOf(em.nextInt());
	}

}
