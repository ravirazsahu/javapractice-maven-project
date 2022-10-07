package com.chapter2;

import com.practice1.util.ConvertIntergerToBinary;

/*
 * Data types supported by switch statements include the following ----
 * 
 * int/Integer
 * byte/Byte
 * short/Short
 * char/Char
 * String
 * enum
 * 
 * 
 * boolea and long (and their associated wrapper classes) are not supported by switch statement
 */
public class SwitchStatement {
public static void main(String[] args) {
	int dayOfWeek=1;
//	long dayOfWeek=1;//Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
	String day="";
	switch(dayOfWeek) {
	default:System.out.println();
	case 0:day="Sunday";
	break;
	case 1:day="Monday";System.out.println("case1");++dayOfWeek;break;
	case 2:day="Tuesday";System.out.println("case2 "+dayOfWeek);break;
	case 3:day="Wednesday";System.out.println("case3");break;
	case 4:day="Thursay";System.out.println("case4");break;
	case 5:day="Friday";System.out.println("case5");break;
	case 6:day="Saturday";System.out.println("case6");break;
	}
	System.out.println(day+" >> "+dayOfWeek);
	
	switch(day) {
	default:System.out.println();
	case "Sunday"	:System.out.println("case0");break;
	case "Monday"	:System.out.println("case1");break;
	case "Tuesday"	:System.out.println("case2 ");break;
	case "Wednesday":System.out.println("case3");break;
	case "Thursay"	:System.out.println("case4");break;
	case "Friday"	:System.out.println("case5");break;
	case "Saturday"	:System.out.println("case6");break;
	}
	
	
}
}
