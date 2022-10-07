package com.chapter2;


/*
 * https://www.baeldung.com/java-compound-operators
 * 
 * E1 op=E2  ===  E1=(T)(E1 op E2) [where T is type of E1]
 */
public class Op_CompoundAssignmentOperators {
public static void main(String[] args) {
	long x=10;
	int y=6;
	x=x*y;//binary arithmetic operator
	y*=x;//compund assignment operator
	System.out.println(x);
	System.out.println(y);
	int a=10;
	int b=(a=33);
	System.out.println(b+(a=33));
	
	float r=8.0f;
	int p=2;
	r*=p;
	System.out.println(p);
	

	int[] xc=null;
//	xc[1]+=5;
	System.out.println(xc);
	

	int[] xc1= {0,2};
	xc1[1]+=5;
	System.out.println(xc1[1]);
	
}
}
