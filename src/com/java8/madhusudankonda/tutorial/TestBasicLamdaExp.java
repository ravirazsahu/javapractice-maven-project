package com.java8.madhusudankonda.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java8.madhusudankonda.tutorial.CreatingLambda.Greeting;

public class TestBasicLamdaExp {
	List<Trade> trades;
	@Before
	public void setup() {
		trades=new ArrayList<>();
		
		trades.add(new Trade(104400,"F"));
		trades.add(new Trade(130000,"S"));
		trades.add(new Trade(110000,"S"));
		trades.add(new Trade(100000,"F"));
		trades.add(new Trade(144000,"P"));
		trades.add(new Trade(105500,"P"));
		trades.add(new Trade(166000,"F"));
		trades.add(new Trade(366000,"P"));
	}
	
	@Test
	public void tradequantitymorethanmillion() {
//		List<Trade> trades=new ArrayList<>();
		
		long x=trades.stream()
		.filter(t->t.getQuantity()>300000)
		.filter(t->t.getStatus().equalsIgnoreCase("P"))
		.count();
		
		//parallalization --> slices the data onto the different cores and 
		//accordingly apply the alogirtithm required for us to slice and dice
		long x1=trades.parallelStream()
				.filter(t->t.getQuantity()>300000)
				.filter(t->t.getStatus().equalsIgnoreCase("P"))
				.count();
		assertEquals(1, x);
		assertEquals(1, x);
		
	}
	@Test
	public void testCreateingLambda() {
		
		String gg=new CreatingLambda().formalgreeting("Harry", (s)->"Hello,"+s);
		System.out.println(gg);
		assertEquals("Hello,Harry",gg);
		
		
	}
}
