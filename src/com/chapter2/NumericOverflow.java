package com.chapter2;

import com.practice1.util.PrimitiveDataTypeCheck;

/**
 * Articles/web sites may help to know the details
 * 
 * https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-2.html#jvms-2.3
 * https://randomprogrammingstuff.wordpress.com/2018/01/01/twos-complement-tutorial-java/
 * 
 * Q:: If I define byte b=127 and I execute ++b, b will be -128, but if I execute b=b+1, will b be 128?
 * https://www.quora.com/If-I-define-byte-b-127-and-I-execute-++b-b-will-be-128-but-if-I-execute-b-b+1-will-b-be-128
 * 
 * Q:: how jvm handles integr overflow
 * https://stackoverflow.com/questions/3001836/how-does-java-handle-integer-underflows-and-overflows-and-how-would-you-check-fo
 * 
 * @author rabi
 *
 */
public class NumericOverflow {
	public static void main(String[] args) {
		byte b = 127;
//	System.out.println(convertIntegerToBinary(b));
		byte c = 2;
//	System.out.println(convertIntegerToBinary(c));
		byte d = (byte) (b + c);
		System.out.println(d);

		System.out.println(b + c); // numeric overflow 3rd rule applied(below line is to check the type of the
									// result)
		System.out.println(PrimitiveDataTypeCheck.typeof(b + c));
//	
//	byte y=(byte)0b00000101;
//	System.out.println(y);

	}

}
