package com.java2novice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateNumber1toN {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(1);
		myList.add(5);
		myList.add(4);
		
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for(int i=0; i< myList.size();i++){
			if(myMap.get(myList.get(i)) == null){
				myMap.put(myList.get(i), 1);
			}else{
				myMap.put(myList.get(i), myMap.get(myList.get(i))+1);
			}
		}
		
		Set<Integer> keys = myMap.keySet();
		for(Integer key : keys){
			int value1 = myMap.get(key);
			if(value1 > 1){
				System.out.println(key+ " is duplicated...");
			}
		}
	}
}
