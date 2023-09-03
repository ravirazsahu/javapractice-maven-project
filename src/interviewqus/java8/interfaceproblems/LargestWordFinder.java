package interviewqus.java8.interfaceproblems;

import java.util.Arrays;

public class LargestWordFinder {

	public static void main(String[] args) {
		System.out.println(largeWord("This is good than everything."));
//int[] a= {51,12,4,100};
//for(int i=0;i<a.length;i++) {
//	for(int j=i+1;j<a.length;j++) {
//		if(a[i]>a[j]) {
//			//System.out.println(a[i]);
//			//System.out.println(a[j]);
//			int x=a[i];
//			a[i]=a[j];
//			a[j]=x;
//		}
//	}
//}


//System.out.println(Arrays.toString(a));
	}

	public static String largeWord(String s) {
		String word="";
		String regx=" ";
		String[] sword=s.split(regx);
		//String[] words=new String[sword.length];
		for(int i=0;i<sword.length;i++) {
			//first take the length of each word
			int l=sword[i].length();
			//sort the array
			for(int j=i+1;j<sword.length;j++) {
			if(sword[i].length()<sword[j].length()) {
				String x=sword[i];
				sword[i]=sword[j];
				sword[j]=x;
				
			}
			//store it in any string array -- not needed
			}
		}
		System.out.println(Arrays.toString(sword));
		
		word=sword[1];
		// then take the 2nd array from that array list
		
		//check if there is multiple words with same length
		
		return word;
	}
}
