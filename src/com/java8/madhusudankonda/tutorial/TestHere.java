package com.java8.madhusudankonda.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHere {
	
	@Test
	public void testCustomisedFunctionalInterface() {
		ComponentFI comp=(s)->{
			System.out.println(s);
			return "Hi, "+s;
		};
		String greeting=comp.find("Sam");
		assertEquals("success","Hi, Sam", greeting);
	}

}
