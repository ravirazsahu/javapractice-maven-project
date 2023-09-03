package interviewqus.java8.interfaceproblems;

public class Reversestring_Infys {

	public static void main(String[] args) {
		String val="POTS";
		StringBuilder build=new StringBuilder();
		build.append(val);
		
		build.reverse();
		System.out.println("SB >> "+build.toString());
		
//		String rev="";
		char[] chr=val.toCharArray();
		char[] chr1= new char[chr.length];
		int j=0;
		for(int i=chr.length-1;i>=0;i--) {
			//for(int j=chr.length;j<i;j++) {
//			System.out.println(chr[i]);
//			System.out.println(chr1[j]=chr[i]);
			chr1[j]=chr[i];
			j++;
			//}
		}
		System.out.println(String.copyValueOf(chr1));
	}
}
