package com.chapter2;

import java.util.ArrayList;
import java.util.List;

import practice1.Employee;

//here CS means control structure
//https://www.baeldung.com/java-control-structures#:~:text=There%20are%20three%20kinds%20of,repeatedly%20run%20specific%20code%20blocks.
public class CS_loops {

	public static void main(String[] args) {
		
		// the variables in the initialization block must all be of the same type.
		int x=0;
		for(long y=0,z=4;x<5&&y<10;x++,y++) {
			System.out.print("x="+x+" ");
			System.out.print("y="+y+" ");
			System.out.print("z="+z+" ");
			System.out.println();
		}
		
		int i = 6;
		System.out.println(i++);
		System.out.println(i);
		{System.out.println("instance initialization block");}
		i = 10;
		System.out.println(++i);
		System.out.println(i);
		
		//redeclaring a variable in the initialization block
		int c=0;
		for (long d=0;c<5&&d<10;c++,d++) {
//			for (long d=0,c=3;c<5&&d<10;c++,d++) {//does not compile
			System.out.println(c+" , "+d);
		}
		int p=0;
		{p=2;}
		long q=1;
		for (p=3,q=0;p<5&&q<10;p++,q++) {
			System.out.println("assign value but doesn't declare in initialization block>> "+p+" , "+q);
		}
		System.out.println();
		
		//for each statement
		
		String[] names= {"shyam","baba","ram"};
		for(String name:names)
			System.out.println("name "+name);
		
		System.out.println();
		Employee emp=new Employee();
		emp.setEmpid("123");
		emp. setEmpname("Ram");
		emp.setEmprm("tester");
		Employee emp1=new Employee();
		emp1.setEmpid("145");
		emp1. setEmpname("Kumar");
		emp1.setEmprm("tester1");
		Employee emp2=new Employee();
		emp2.setEmpid("111");
		emp2. setEmpname("Gopi");
		emp2.setEmprm("tester2");
		
		List<Employee> emplist=new ArrayList<>();
		emplist.add(emp);
		emplist.add(emp1);
		emplist.add(emp2);
		
		for(Employee empforeach:emplist) {
			System.out.println("emp for each :: "+empforeach.getEmpid()+" :: "+empforeach.getEmpname()+" :: "+empforeach.getEmprm());
		}
		
		//above statement is similar to below
		for(java.util.Iterator<Employee> em=emplist.iterator();em.hasNext();) {//notice that we are using ; not :
			Employee i_emp=em.next();
			System.out.println("emp for  :: "+i_emp.getEmpid()+" :: "+i_emp.getEmpname()+" :: "+i_emp.getEmprm());
		}
	}
}
