package practice1;

import java.util.Arrays;

public class loopPractice {
public static void main(String[] a) {
//	string[] strarr;
	String[] str=new String[]{"[{\"empid\"=\"1213\",\"emprm\"=\"4\",\"empname\"=\"fsfds\"}]",
	"[{\"empid\"=\"2121\",\"emprm\"=\"5\",\"empname\"=\"czda\"}]"};
	Object[] obj=(Object[])str;
	
	String[] strings = Arrays.stream(obj).toArray(String[]::new);
	String[] strings1 = Arrays.stream(strings).toArray(String[]::new);
	
//	@SuppressWarnings("unchecked")
//	List<Employee> emplist=(ArrayList<Employee>)obj[0];
//	System.out.println(emplist.toString());
System.out.println(obj[0]+" >> "+strings1[0]);
System.out.println(obj[1]);
//	System.out.println("dsajj");
//
//	int n=11;
//	for(int i=2;i<=n/2;i++) {
//		if(n%i==0) {
//			System.out.println(i);
//		}else {
//			System.out.println(i+" prime");
//	
//		}
//	}
//	for(int i=0;i<4;i++) {
//		System.out.print("*");
////		i++;
//		for(int j=0;j<1;j++) {
//			System.out.print("=");
////			j--;
//		}
//	}
	
	
//	for (int i = 0; i < 4; i++) {
//		System.out.print("*");
//		for (int j = i+1; j <=i+1; j++) {
//			
//			System.out.print(i+"="+j);
////			System.out.print("*");
//		}
//	}


//row =1
//*=5
//#=4
//*=*=*=*
	
}
}