package com.chapter2;

public class IncrementAndDecrementOperators {
private static String break_line="------------";
	public static void main(String[] args) {
		int c=0;
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		System.out.println(c--);
		System.out.println(c);
		System.out.println(break_line);
		int x=3;
		int y=++x*5/x--+--x;
		System.out.println(x);
		System.out.println(y);
	}
}
