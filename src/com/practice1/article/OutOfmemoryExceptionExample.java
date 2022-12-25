package com.practice1.article;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OutOfmemoryExceptionExample {
	/*
	 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space at
	 * java.lang.Integer.valueOf(Integer.java:832) at
	 * com.practice1.article.OutOfmemoryExceptionExample.addRandomDataToMap(
	 * OutOfmemoryExceptionExample.java:27) at
	 * com.practice1.article.OutOfmemoryExceptionExample.main(
	 * OutOfmemoryExceptionExample.java:11)
	 */

	
 public static void main(String[] args) {
	addRandomDataToMap();
	addRandomDataToMap();
	addRandomDataToMap();
	addRandomDataToMap();
	addRandomDataToMap();
	addRandomDataToMap();
	addRandomDataToMap();
	System.out.println("done");
}
 
 

	    public static void addRandomDataToMap() {
	        Map<Integer, String> dataMap = new HashMap<>();
	        Random r = new Random();
	        while (true) {
	            dataMap.put(r.nextInt(), String.valueOf(r.nextInt()));
	        }
	    }
	
}
