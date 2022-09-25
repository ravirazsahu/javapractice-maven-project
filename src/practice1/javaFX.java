package practice1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class javaFX {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "This is sanjay das";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");

	}
}
