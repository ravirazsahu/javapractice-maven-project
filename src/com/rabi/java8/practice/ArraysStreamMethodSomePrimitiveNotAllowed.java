package com.rabi.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysStreamMethodSomePrimitiveNotAllowed {
	
	public static void main(String[] args) {
		System.out.println("ArraysStreamMethodSomePrimitiveNotAllowed");
		List<Integer> arrayList = new ArrayList<>();
		IntStream.range(1, 1000).forEach(arrayList::add);
		
		char[] cng=new char[100];
		short[] sng=new short[100];
		byte[] bng=new byte[100];
		int[] ing=new int[100]; //{440,3313,40,64};//"".toCharArray();
		long[] lng=new long[100]; //{10l,3313l,4l,5l};//"".toCharArray();

		System.out.println(arrayList.size());
		System.out.println(ing.length);
		ing=arrayList.stream().mapToInt(Integer::intValue).toArray(); //dont know how this fits in ing
//		Arrays.stream(cng).sorted().forEach(x->{System.out.println(x++);}); //compiletime error
//		Arrays.stream(sng).sorted().forEach(x->{System.out.println(x++);});//compiletime error
//		Arrays.stream(bng).sorted().forEach(x->{System.out.println(x++);});//compiletime error
		Arrays.stream(ing).sorted().forEach(x->{
			if(x==999)
			System.out.println(x);
		});
		Arrays.stream(lng).sorted().forEach(x->{if(x==55)System.out.println(x);});
		
	}

}
