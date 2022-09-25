package com.chapter2;

import com.practice1.util.ConvertIntergerToBinary;
import com.practice1.util.PrimitiveDataTypeCheck;

/**
 * 
 * @author rabi
 *
 */
public class TwoSComplementExperiment {
//java doc : https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-2.html#jvms-2.3
	// https://randomprogrammingstuff.wordpress.com/2018/01/01/twos-complement-tutorial-java/

	public static void main(String[] args) {

		byte b = 127;
		System.out.println(ConvertIntergerToBinary.convert(b));
		byte c = 127;
		System.out.println(ConvertIntergerToBinary.convert(c));
		/*
		 * Smaller data types, namely byte, short, and char, are first promoted to int
		 * any time they’re used with a Java binary arithmetic operator, even if neither
		 * of the operands is int.
		 */
		System.out.println(PrimitiveDataTypeCheck.typeof(b + c));
//		Short d= (short) (b+c);//254 
		byte d = (byte) (b + c);
		System.out.println(d);

		System.out.println(Byte.toUnsignedInt((byte) -8));
	}

}
