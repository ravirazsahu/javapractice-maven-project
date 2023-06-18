package com.chapter3;

public class EscapingReferenceExample {
	public static void main(String[] args) {
		String t="20";
		t=checkstring(t);
		System.out.println("t >> "+t);
	}
	
	public static String checkstring(String x) {
		x="30";
		return x;
	}

}
