package com.chapter4;

import java.util.Arrays;
import java.util.List;

import com.chapter3.Person;
	
public class MajorGcTestCode {
public static void main(String[] args) {
	Person o=new Person("T", 12);
	Person o1=new Person("Tq", 14);
	Person o2=new Person("Tf", 10);
	List<Person> lstp=Arrays.asList(o,o1,o2);
	o=null;
	System.out.println(lstp.get(0).getName().toString());
	System.out.println(o.getName().toString());
	lstp=null;
	System.out.println(lstp.get(0).getName().toString());
	
}
}
