package com.java8.madhusudankonda.tutorial;
import java.util.*;
import java.util.stream.IntStream;

public class LambdaMinMax {

	public int getsum() {
		List<String> s=Arrays.asList("1","2","3","4","5","6");
		IntStream ints=s.stream().mapToInt(n->Integer.valueOf(n));
		IntStream ints1=ints;
		OptionalInt opintmax=ints.max();
		OptionalInt opintmin=ints1.min();
		
		int sum=opintmax.orElse(5)+opintmin.orElse(5);
		System.out.println(sum);
		ints.close();
		ints1.close();
return sum;
		
		
	}
	
	public static void main(String[] args) {
		LambdaMinMax kk=new LambdaMinMax();
		kk.getsum();
	}
	
	
}
