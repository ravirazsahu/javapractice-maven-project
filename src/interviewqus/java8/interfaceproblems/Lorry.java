package interviewqus.java8.interfaceproblems;

public interface Lorry {
	public static final int wheels = 6;
	public default void noofwheels() {
		System.out.println("Lorry wheels are : "+wheels);
	}
}
