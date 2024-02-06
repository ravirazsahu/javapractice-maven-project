package com.ken.kousen.feb2024;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LazySupplierTest {

	
	private String getErrorMessage() {
		return "Error message";
		
	}
	
	@Test
	void eagerSupplier() {
		
		boolean x=true;
		assertTrue(x,()->getErrorMessage());
		
	}
	@Test
	void eagerSupplier1() {
		
		boolean x=true;
		assertTrue(x,()->getErrorMessage());
		
	}
}
