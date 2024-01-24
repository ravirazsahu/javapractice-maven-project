package com.practice1.setpractice;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Set<String> s=new  HashSet<>();
		
		s.add("B");
		s.add("A");
		s.add("B");
		s.add("D");
		
		System.out.println(s.toString());
		
	}

}
