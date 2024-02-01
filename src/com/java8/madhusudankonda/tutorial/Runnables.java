
package com.java8.madhusudankonda.tutorial;

import java.util.concurrent.Callable;

public class Runnables {
public void acceptingRunnable(Runnable run) {
	
}
public void acceptingCallable(Callable call) {
	
}

public static void main(String[] args) {
	Runnable run=()->System.out.println("Hello,Lambda");
	new Runnables().acceptingRunnable(run);
	
	Callable call=()->{
		String gg="Calling";
		System.out.println(gg);
		return gg;
		};
		
		new Runnables().acceptingCallable(call);
}
}
