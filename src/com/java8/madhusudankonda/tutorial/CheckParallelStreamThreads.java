package com.java8.madhusudankonda.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckParallelStreamThreads {
	
	public void printparallelstreamthreads() {
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 31, 4);
//		Integer x1=listOfNumbers.stream().skip(2).findFirst().map(x->x*3).ifPresent(System.out::print);
//		Integer x1=listOfNumbers.stream().skip(2).findFirst().map(x->x*3).get();
//		Integer x1=listOfNumbers.stream().skip(2).findFirst().map(x->x*3).filter(x->x<3).orElse(0);
//		Integer x1=listOfNumbers.stream().skip(2).findFirst().map(x->x*3).filter(x->x<3).get();
		
		
//		System.out.println(x1);
//		listOfNumbers.parallelStream().forEach(number ->
//		    System.out.println(number + " " + Thread.currentThread().getName())
//		);
		
//		List<List<Integer>> listofints=new ArrayList<ArrayList<Integer>>();
		
		List<String> liststring=Arrays.asList("a","b","a");
		Set<String> listofUpcase=liststring.stream().map(x->x.toUpperCase()).collect(Collectors.toSet());
//		listofUpcase.forEach(System.out::printf);
		
		
		List<List<String>> listofalphas=Arrays.asList(
				Arrays.asList("a","b","c","b"),
				Arrays.asList("a","b"),
				Arrays.asList("a","b","c"),
				Arrays.asList("a","b","c","a")
				);
		
		Set<String> listofalphas1=listofalphas.stream().flatMap(l->l.stream()).collect(Collectors.toSet());
		List<String> listofalphas11=listofalphas.stream().flatMap(l->l.stream()).collect(Collectors.toList());
		listofalphas1.stream().forEach(System.out::println);
		System.out.println("\n");
		listofalphas11.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		CheckParallelStreamThreads kk=new CheckParallelStreamThreads();
//		kk.getsum();
		kk.printparallelstreamthreads();
	}

}
