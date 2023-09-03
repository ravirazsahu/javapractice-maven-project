package interviewqus.java8.interfaceproblems;

import java.util.Arrays;

public class Anagram_ltimind {
	
	//when thre are two words then check whether they are anagram words or not
	public static void main(String[] args) {
		String s1="cat";
		String s2="act ";
		boolean val=isAnagramWords(s1,s2);
		if(val)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}

	private static boolean isAnagramWords(String s1, String s2) {
		//if each character in the 
		char[] ch1=s1.trim().toCharArray();
		char[] ch2=s2.trim().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			return true;
		}
		return false;
		
	}
	
	

}
