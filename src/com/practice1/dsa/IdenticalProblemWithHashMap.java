package com.practice1.dsa;

import java.util.HashMap;
import java.util.Map;


/**
 * @author rabi
 * 
 * @see https://workat.tech/problem-solving/practice/identical-twins
 * 
 * @see https://leetcode.com/problems/number-of-good-pairs/
 *
 */
public class IdenticalProblemWithHashMap {

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,4};
		System.out.println(numIdenticalPairs(arr));
	}
	
	    public static int numIdenticalPairs(int[] arr) {

	        Map<Integer,Integer> frequency=new HashMap<Integer,Integer>();
	        for(int i=0;i<arr.length;i++){

	            Integer val=frequency.get(arr[i]);
	            if(val==null){
	                frequency.put(arr[i],1);
	            }else{
	                frequency.put(arr[i],++val);
	            }
	        }

	        int identicalcount=0;

	        for(Map.Entry<Integer,Integer> entr:frequency.entrySet()){
	            identicalcount+=(entr.getValue()*(entr.getValue()-1))/2;
	        }

	        return identicalcount;
	        
	    }
	
}
