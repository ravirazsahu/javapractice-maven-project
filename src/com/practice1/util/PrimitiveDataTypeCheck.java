package com.practice1.util;

/**
 * Below code is taken 
 * <a href=
 * "">https://stackoverflow.com/questions/709961/determining-if-an-object-is-of-primitive-type</a>
 * link
 *
 * @author rabi
 *
 */
public class PrimitiveDataTypeCheck {

	// https://stackoverflow.com/questions/709961/determining-if-an-object-is-of-primitive-type

	public static Class<Integer> typeof(final int expr) {
		return Integer.TYPE;
	}

	public static Class<Short> typeof(final short expr) {
		return Short.TYPE;
	}

	public static Class<Float> typeof(final float expr) {
		return Float.TYPE;
	}

	public static Class<Byte> typeof(final byte expr) {
		return Byte.TYPE;
	}

	public static Class<Long> typeof(final long expr) {
		return Long.TYPE;
	}

}
