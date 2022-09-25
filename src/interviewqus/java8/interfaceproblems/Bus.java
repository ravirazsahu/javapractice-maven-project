package interviewqus.java8.interfaceproblems;

public interface Bus {
	public static final int wheels = 6;
	public default void noofwheels() {
		System.out.println("Bus wheels are : "+wheels);
	}
}
