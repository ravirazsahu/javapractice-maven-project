package practice1;

public class HexawareDemo {
	public static void main(String[] args) {

		System.out.println(count());
	}

	public static int count() {
		
		try {

			  return 0/0;

			 } catch(Exception e) {

					 System.out.println("Exception occurred");

//					 System.exit(0);

			  return 2;

			 }finally {
			//	return 3;
			}
	}
}
//Exception occurred
