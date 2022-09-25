package com.chapter2;

public class Operatorsexperiment {
	private static String NL="\n";
	public static void main(String[] args) {
//durgasir
		int x=10;
		int y=++x;
//		int z=++10;//invalid argument to operation ++/-- //CTError
//		System.out.println("x+y+z >> "+++y); //its invalid here
		System.out.println("y++ >> "+y++);
		System.out.println("x+y+z >> "+(++y));
//		int z=++(++y);//not allowed
		
		final int a=10;
//		int b=++a;//The final local variable a cannot be assigned. It must be blank and not using a compound assignment
		
		byte bb=10;
		char ch='a';
		double d=10.5;
		float f=5.8f;
		boolean b=false;
		System.out.println("we can apply inc/dec operator to following primitive types except boolean type:: \n");
		System.out.println("char type :"+(++ch));
//		System.out.println(NL);
		System.out.println("Double type :"+(++d));
//		System.out.println(NL);
		System.out.println("Float type :"+(++f));
//		System.out.println(NL);
		System.out.println("Byte type :"+(++bb));
//		System.out.println("boolean type :"+b++);//CTError
		System.out.println(NL);
		
		System.out.println("What is the difference between byte=byte+1 and ++byte :: \n");
		byte _ba=10;
		byte _bb=20;
//		byte _plp=(_ba+_bb);//possible loss of precision 
		//because internally java use arithmetic operator as max(int, type of a, type of b)
		int _cc=_ba+_bb;
		byte _cd=(byte)(_ba+_bb);
		System.out.println("_cc "+_cc);
		System.out.println("_cd "+_cd);
		
		//arithmatic operator
		int _x=2*5+3*4-8;
		System.out.println(" precedence :: "+_x);
		
System.out.println(NL);
System.out.println("1 + 2 = " + _x + 2);
System.out.println("1 + 2 = " + (1 + 2));


byte num=(byte)0b00000101;
System.out.println(num);
//bitwise logical operator (|,&,^)  ||| short-circuit logical operator (&&,||)
System.out.println(-8|8);
double da=0.2;
double db=0.3;
System.out.println(da+db);
		
	}

}
