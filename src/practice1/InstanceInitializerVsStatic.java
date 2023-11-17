package practice1;

public class InstanceInitializerVsStatic {
 int var=123;
 static int svar=134;
 
 
	public InstanceInitializerVsStatic() {
		System.out.println("constructor "+var+" "+svar);
	}
	
	
	{
		System.out.println("instance initializer "+var+" "+svar);
	}
	
	
	static {
		System.out.println("static block "+svar);
	}
	
	
// I want to check if instance initializer block executes first or static block
	public static void main(String[] args) {
		InstanceInitializerVsStatic obj=new InstanceInitializerVsStatic();
		System.out.println("main method "+svar);
	}

}
