package com.java.whatis.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	
	public static void main(String[] args) {
	      Map<String, String> employeePhoneMap = new HashMap<>();
	      Map<String, String> employeePhoneMap1 = new HashMap<>();

	        // Populate the map with sample data
	        employeePhoneMap.put("John", "931123");
	        employeePhoneMap.put("Alice", "91456");
	        
//	        for(int i=0;i<employeePhoneMap.size();i++) {
//	        	
//	        	String dig=employeePhoneMap.get(i).toString().substring(0,2);
//	        	if(employeePhoneMap.get(i).contains(dig)) {
////	        		employeePhoneMap1.put(employeePhoneMap.get(i), employeePhoneMap.get(i));
//	        		System.out.println(employeePhoneMap1.get(i));
//	        	}
//	        }
	        
	        for(Map.Entry<String, String> e:employeePhoneMap.entrySet()) {
//	        	e.getKey();
//	        	e.getValue();
	        	
	        	String dig=e.getValue().toString().substring(0,3);
	        	System.out.println(dig);
	        	if(dig.equalsIgnoreCase("931")) {
	        		employeePhoneMap1.put(e.getKey(), e.getValue());
	        	}
	        }
	        
	        System.out.println(employeePhoneMap1.toString());
	}

}
