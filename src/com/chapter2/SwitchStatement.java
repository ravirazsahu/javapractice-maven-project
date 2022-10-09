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
 * 
 * do not miss the break; or else it will execute every case
 * 
 * The case statement value must also be a literal, enum constant, or final constant variable.(we have tried everything below)
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
	System.out.println();
	//do not miss the break; or else it will execute every case after the matching case
	int checkbreak=3;
	switch(checkbreak) {
	default:System.out.println("default1");
	case 0:System.out.println("case0");
	case 1:System.out.println("case1");
    case 2:System.out.println("case2");
    case 3:System.out.println("case3");
    case 4:System.out.println("case4");
    case 5:System.out.println("case5");
    case 6:System.out.println("case6");
//    default:System.out.println("default");//it will throw compile time error
	}
	
	System.out.println();
	System.out.println("negative numbers works in java8");
	
	int neg_value=3;
	switch(neg_value) {
	default:System.out.println("default");
	case 0:System.out.println("case0");break;
	case 1:System.out.println("case1");break;
	case 2:System.out.println("case2");break;
	case 3:System.out.println("case3");break;
	case -3:System.out.println("case-3");break;
	case 4:System.out.println("case4");break;
	case 5:System.out.println("case5");break;
	case 6:System.out.println("case6");break;
	}
	
	String option="LIST1";
	switch(EnumString.valueOf(option)){
//	default : System.out.println("default"); //why it prints default (it doesn't print if the default is at the beginning)
    case LIST1: System.out.println("test list1");break;
    default : System.out.println("default"); 
    //etc.
}
	//check return works or not
	final String List3="List2";
	String ret_sta_exmp="LIST2";
	switch(ret_sta_exmp){
    case "LIST1": System.out.println("check return statement");break;
//    case "LIST2": return 52;// this will throw error since the "main" method doesn't return anything (try switch statement in a separate method)
    case "LIST2": 
    	System.out.println("Price of rice  is "+getPrice("Rice"));
    	System.out.println("Price of Dal   is "+getPrice("Dal"));
    	System.out.println("Price of Sugar is "+getPrice("Sugar"));
    break;
    case List3: System.out.println("check return statement");break;//final variable are allowed
//    case "LIST1": System.out.println("test list1");break;//it will throw duplicate case error
//    case LIST1: System.out.println("test list222");break;//it will not compile since the case must be a string literals
//    default : System.out.println("default"); 
    //etc.
}
}
public static int getPrice(String item) {
	switch(item) {
	case "Rice":return 30;
	case "Dal":return 120;
	case "Sugar":return 20;
	default:return 0;
	}
}
}
