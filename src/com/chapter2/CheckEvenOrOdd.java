package com.chapter2;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to check if number is even or not
//				int num=10;
//				if(num%2==0)
//					System.out.println("1even");

	}
public boolean checkEvenorOdd(int num) {
	//above mentioned code is normal one
	boolean flag=false;
	if((num&1)==0) {//should be (num&1) not num&1 
		System.out.println("even num");
		return true;
		
	}
	System.out.println("odd num");
	return flag;
}
}
