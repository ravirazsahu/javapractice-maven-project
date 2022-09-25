package com.java.whatis.hashcode;

import practice1.Employee;

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
