package practice1;

public class CognizantYTQus2 {
	
	public static void main(String[] args) {
		Base b=new Base();
		Base b1=new Derived();
		Derived d=new Derived();
		printit(b);
		printit(b1);
		printit(d);
		
		
	}
	
	private static void printit(Base b) {
		b.doprint();

	}

}
