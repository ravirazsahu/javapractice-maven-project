package practice1;

/**
 * @author rabi
 *
 */
public class DataTypeDoubtPractice {

	public DataTypeDoubtPractice() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param a
	 * @param b
	 * @param d
	 * @param bc
	 * @return
	 */
	public String testnot(int a,String b,Double d, Boolean bc) {
		return "";
		//tested parameter creation comments by using alt+shift+j	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Type mismatch: cannot convert from int to byte
//		byte b=-125;
		byte b=(byte)258;
		System.out.println(b);
		System.out.println(1 == 0b00000001);
	}

}
