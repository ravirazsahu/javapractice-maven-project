package practice1;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		/*
		 * To know whether an object is polymorphic, you can perform a simple test. If the object successfully passes 
		 * multiple is-a or instanceof tests, it’s polymorphic. As described in our post about inheritance, all Java 
		 * classes extend the class Object. Due to this, all objects in Java are polymorphic because they pass at least two instanceof checks.
		 * 
		 */
		Employee emp=new Employee();
		System.out.println(emp instanceof Object);
		
	}
}
