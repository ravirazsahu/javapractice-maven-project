package practice1;

import practice1.NewClass.superclass;

public class ConstructorPractice extends ConstructorParentPractice{

	public ConstructorPractice() {
		//if you have defined parent arg constructor then
//		super(child); //if you comment this then it will throw compilation error (Must explicitly invoke another constructor)
//		super();// this will also throw error 
		super.testsuper_ref_var=5;//super is a reference variable here that is used to refer parent class object
		System.out.println("Child class ");
		checksupervariable();
	}
	
	public void checksupervariable() {
		System.out.println("parent class super var "+super.testsuper_ref_var);
//		new ConstructorPractice("main child");
	}
	public static void main(String[] args) {
//		System.out.println("parent class super var ");
		new ConstructorPractice();
	}
}
