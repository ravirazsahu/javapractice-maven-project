package com.chapter3;

public class StringConstantPool {

	public static void main(String[] args) {
		String s1=new String("Test any thing. .. ");
		String s2=new String("Test any thing. .. ");
		System.out.println("s1==s2 "+(s1==s2));
		
		String s3=new String("Test any thing").intern();//if you remove intern() here then it will print false
		String s4=new String("Test any thing").intern();
		System.out.println("s3==s4 "+(s3==s4));
		
		String kk="Fluffy";
		String kk1 =new String("Fluffy");
		System.out.println("kk==kk1 "+(kk==kk1));
		System.out.println("kk.equalsIgnoreCase(kk1) "+kk.equalsIgnoreCase(kk1));
		
		String k="Fluffy";
		String k1 =new String("Fluffy");
		k=k.concat(" thing.");
		k1=k1.concat(" things !!!");//does this changes the original string ?
		System.out.println("k.intern() "+k.intern());
		System.out.println("k1 "+k1);
		
//		assertThat()
	}
}
