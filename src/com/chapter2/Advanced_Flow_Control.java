package com.chapter2;

public class Advanced_Flow_Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FIRST_CHAR_LOOP:for(int a=1;a<=4;a++) {
			for(char x='a';x<='c';x++) {
				if(a==2||x=='b') {
//					System.out.println("continue "+a+" "+x);
					continue FIRST_CHAR_LOOP;
				}
				System.out.println("--"+x+a);
			} 
			System.out.println("------");
		}
	System.out.println("----------------------------------------");
	//continue
	for(int i=0;i<10;i++) {
		if(i<5)
			continue;
		System.out.println("continue i is "+i);
	} 
	
	// what if we use the same statement for break ? what would be the output : it prints nothing
	for(int i=0;i<10;i++) {
		if(i<5)
			break;
		System.out.println("break: i is "+i);
	} 
	//compile time error
//	for(char x='a';x<='c';x++) {
//		if(x=='b') {
//			System.out.println("continue");
//			continue FIRST_CHAR_LOOP;
//		}
//			
//		}

	}

}
