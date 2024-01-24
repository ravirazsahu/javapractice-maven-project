package com.java8.madhusudankonda.tutorial;


/*
 * Creating a formal greeting for visitor
 * 
 * Given a visitor the program should return an output formally greeting the visitor
 * 
 * input -- Harry 
 * Op -- Hello Harry
 * 
 * Exception/unhappy flow-- did you forget something ?
 * */
public class CreatingLambda {
	
	interface Greeting{
		public String sayHello(String name);
	}
	public void formalgreeting(String name,Greeting g) {
		String result=g.sayHello(name);
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		new CreatingLambda().formalgreeting("Harry", (s)->"Hello, "+s);
		new CreatingLambda().formalgreeting("Miss Pingu", (s)->"Hello, "+s);
		
		new CreatingLambda().formalgreeting("Miss Pingu", (s)->s.isEmpty()?"Did you miss something?":"Hello, "+s);
	}

}
