package com.lourud.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindTheNumberOccuringOddNumberOfTimes {

public static void main(String[] args) {
		
		int[] arr = {1,1,3,4,1,5,1,3};
		int f = arr.length /2 ; 
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++){
			int count = 1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count = count + 1;
				}
			}
			
			if(myMap.get(arr[i]) == null){
				myMap.put(arr[i], count);
			}
			
		}
		
		Set<Integer> myKeys = myMap.keySet();
		Iterator ite = myKeys.iterator();
		while(ite.hasNext()){
			int keyValue = (int) ite.next();
			if(myMap.get(keyValue) % 2 != 0){
				System.out.println(keyValue);
			}
		}
		
		
	}
}
