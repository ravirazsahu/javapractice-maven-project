package com.chapter3;

public class CallByValue {

	  public static void main(String[] args) {
	    Person myPerson = new Person("Jane", 25);
	    System.out.println("Before modifying: " + myPerson.getName() + " " + myPerson.getAge());
	    modifyPerson(myPerson,40);
	    System.out.println("After modifying: " + myPerson.getName() + " " + myPerson.getAge());
	  }

	  //this method takes the copy of reference of Person object
	  //and take the primitive value
	  public static void modifyPerson(Person person, int newAge) {
		person.setName("Jake");
	    person.setAge(newAge);
	  }
	
}
