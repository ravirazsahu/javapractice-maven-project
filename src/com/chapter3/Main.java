package com.chapter3;

import org.openjdk.jol.vm.VM;

public class Main {

//	  public static void main(String[] args) {
//	    Person myPerson = new Person("Jane", 25);
//	    System.out.println("Before modifying: " + myPerson.name + " " + myPerson.age);
//	    modifyPerson(30, "John");
//	    System.out.println("After modifying: " + myPerson.name + " " + myPerson.age);
//	  }
//
//	  public static void modifyPerson(Person person, int newAge, String newName) {
//	    person.age = newAge;
//	    person.name = newName;
//	  }
	
	public static void main(String[] args) {
		
        Nest n1 = new Nest(); // 1
        Nest n2 = new Nest(); // 2
        n1.setNest(n2); // 3
        n2.setNest(n1); // 4
        n1 = null; // 5
        n2 = null; // 6
        
		System.out.println(VM.current().details());
	}
	
}
