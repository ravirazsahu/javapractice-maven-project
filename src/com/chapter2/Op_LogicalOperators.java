package com.chapter2;

import com.practice1.util.ConvertIntergerToBinary;

import practice1.AbstractCar;
import practice1.Car_BMW;
import practice1.Car_MERCEDES;

public class Op_LogicalOperators {
public static void main(String[] args) {
	System.out.println("& - 		 AND "+(2&2));
	System.out.println("| - inclusive OR "+(1|1));
	System.out.println("^ - exclusive OR "+(1^1));
	/*
	 * XOR
	 * https://www.baeldung.com/java-xor-operator
	 * 
	 */
	System.out.println("^ - exclusive OR "+(1^2));
	
	int a = 6; // 110
	int b = 4; // 100

	// Bitwise AND    / boolean logical & /

	int c = a & b;
	//   110
	// & 100
	// -----
	//   100

	// Bitwise OR

	int d = a | b;
	//   110
	// | 100
	// -----
	//   110

	System.out.println(c); // 4
	System.out.println(d); // 6
	
//	AbstractCar car=new Car_BMW("2015Model",4,false);
	AbstractCar car=new Car_MERCEDES("2018Model",4,true);
//	car.isDisel();
//	car.isPetrol();
	//so here if one of the method return true , other false then one of the car is Diesel car
	if(car.isDiesel()^car.isAutoParking()) {
		System.out.println("&/|   Diesel or autopark");
	}
	System.out.println("car.isDiesel() && !car.isAutoParking() >> "+(car.isDiesel() && !car.isAutoParking()));
	System.out.println("!car.isDiesel() && car.isAutoParking() >> "+(!car.isDiesel() && car.isAutoParking()));
	if((car.isDiesel() && !car.isAutoParking())||(!car.isDiesel() && car.isAutoParking())) {
		System.out.println("&&/|| Diesel or autopark");
	}
//	car.isDiesel()
//	--------------------------------------------------------------------------------------------------------------------------------------------
	//do not forget the braces ()
	int n=3;
	System.out.println("div "+n/2);
	System.out.println("div "+ (n>>1));
	
	int n1=3;
	System.out.println("mul "+n1*2);
	System.out.println("mul "+ (n1<<1));
	
	//check CheckEvenOrOdd class
	//to check if number is even or not
		int num=10;
		if(num%2==0)
			System.out.println("1even");
		
		int num1=49;
		System.out.println("binary form of "+num1+" is "+ConvertIntergerToBinary.convert(num1));
			if((num1 & 1)==0)
			System.out.println("2even and value of (num1 & 1) is "+(num1 & 1));
	
}
}
