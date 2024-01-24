package com.java8.madhusudankonda.tutorial;

public interface Component {

	public String find(String compname);
	
	default public String getName() {
		return "Default Name";
	}
	default public void init() {
		System.out.println("Initiating sequence.....");
	}
}
