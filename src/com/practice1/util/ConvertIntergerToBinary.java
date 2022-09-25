package com.practice1.util;

public class ConvertIntergerToBinary {

	public static String convert(int n) {
	    if (n == 0) {
	        return "0";
	    }
	    StringBuilder binaryNumber = new StringBuilder();
	    while (n > 0) {
	        int remainder = n % 2;
	        binaryNumber.append(remainder);
	        n /= 2;
	    }
	    binaryNumber = binaryNumber.reverse();
	    return binaryNumber.toString();
	}
}
