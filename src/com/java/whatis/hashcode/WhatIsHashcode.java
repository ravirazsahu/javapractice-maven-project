package com.java.whatis.hashcode;

import practice1.Employee;

/* Some important resources I found while searching hashtable
 * https://www.objectos.com.br/blog/how-to-implement-hash-table-in-java-part1.html 
 * 
 */
public class WhatIsHashcode {

	public WhatIsHashcode() {
		// TODO Auto-generated constructor stub
	}

	//hashcode() mehtod is a int type number generated using a hash function.
	public static void main(String[] args) {
		Employee emp=new Employee();
		int a=emp.hashCode();
		Employee emp1=new Employee();
		int b=emp1.hashCode();
		System.out.println("a= "+a+" , b= "+b);
	}
}
