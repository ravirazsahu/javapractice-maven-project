package com.chapter2;

import com.practice1.util.PrimitiveDataTypeCheck;

public class NumericPromotionRule {
	
	public static void main(String[] args) {
		
		System.out.println("=====================Rule-1====================");
		// if two values have different data types, java will automatically promote one
		// of the values to the larger of the two data types
		int x=5;
		long y=11;
//		int re=x*y;//CTError
		long re=x*y;
		System.out.println((x*y));
		
		int a=5;
		double b=11;
		double z=a*b;
		System.out.println(a*b);
		
		
		System.out.println("=====================Rule-2====================");
		// if one of the values is integral and the other is floating-point, java will
		// automatically promote the integral value to the floating-point value's data
		// type.
		double s=23.4;
		float p=2.1f;
		double q=s*p;
		System.out.println("s+p="+(s+p)+" s*p="+q);
		
		long ss=4;
		float oo=1;
		System.out.println("ss*oo="+ss*oo);
		
		System.out.println("=====================Rule-3====================");
		// smaller data types,namely byte,short and char are first promoted to int any
		// time they're used with a java binary arithmetic operator , even if neither of
		// the operands is int.

		short t=8;
		short f=9;
		int c=t*f;//t+f;t*f;t/f;t%f //promoted to int for binary arithmetic operator
		//short _c=t+f;//CTError
		System.out.println(c);
		System.out.println(PrimitiveDataTypeCheck.typeof(t + f));
		
		System.out.println("=====================Rule-4====================");
		// After all promotion has occurred and the operands have the same data type, the
		// resulting value will have the same data type as its promoted operands.
		
		short xx=14;
		float yy=13;
		double zz=30;
		System.out.println(xx*yy/zz);
		
		//can long promoted to float
//		long ll=4329843;
//		float ff=ll;
//		int ii=ll;
//		double dd=ll;
		
//		why int is smaller than float even though both of them having the same size
		
		
		//infinity
		System.out.println("\n");
		System.out.println(10/0.0);
		System.out.println(10.0/0);
		System.out.println(-10.0/0);
		System.out.println(10/0);
	}

}
