package com.ken.kousen.feb2024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import org.junit.jupiter.api.Test;

public class StringExercise {
	
	private List<String> slist=Arrays.asList("This","is","a","string");
	
	@Test
	void srotByLength_collection_sort() {
		Collections.sort(slist,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				return s1.length()-s2.length();
			}
			
			
		});
		
		System.out.println(slist);
	}
	@Test
	void srotByLength_Innerclass() {//java 5,6,7
		slist.sort(new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				
				return s1.length()-s2.length();
			}
			
			
		});
		
		System.out.println("j567"+slist);
	}
	@Test
	void srotByLength_lmbda() {//java 5,6,7
		slist.sort((s1,s2)->s1.length()-s2.length()
				);
		System.out.println("j8"+slist);
		
		//use the sorted method on stream
		
		List<String> sortedstr=slist.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());//.toList(); //java 17 
		System.out.println("sortedstr"+sortedstr);
	}
	@Test
	void democollectors() {
		
		Map<String,Integer> map=slist.stream()
				//.collect(Collectors.toMap(s->s,String::length));
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);
		
		
		List<String> stringWithNulls=Arrays.asList("This",null,"is",null,"a",null,"string");
		
		List<String> evenlist=stringWithNulls.parallelStream()
//		.filter(s->s!=null&&s.length()%2==0)
		.filter(Objects::nonNull)
//		.filter(s->s!=null)
		.filter(s->s.length()%2==0)//no performance issue with above sort cercuting process i.e &&
		.toList();
		System.out.println("evenlist "+evenlist);
		
		
		//
		Predicate<String> nonull=Objects::nonNull;
		Predicate<String> even=s->s.length()%2==0;
		evenlist=stringWithNulls.parallelStream()
				.filter(nonull.and(even))
				.toList();
		
		System.out.println("predicate "+evenlist);
		
//		Consumer<String> c=System.out::print;//we cant chain like predicate
	}

}
