package practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hexaware_Hashmap {
	
	public static void main(String[] args) {
		
	
	List<String> list = Arrays.asList("mumbai","city","chnenai","mumbai","mumbai","city");
	Map<String,Integer> kk=new HashMap<>();
	int count=0;
	for(int i=0;i<list.size();i++) {
		for(int j=i+1;j<list.size();j++) {
		if(list.get(i).equalsIgnoreCase(list.get(j))) {
			++count;
			kk.put(list.get(i), count);
		}
		}
	}
	
	System.out.println(kk.toString());
}
}
