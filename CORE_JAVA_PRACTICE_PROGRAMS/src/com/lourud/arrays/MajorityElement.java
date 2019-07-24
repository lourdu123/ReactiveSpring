package com.lourud.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MajorityElement {
	
	//  A majority element in an array A[] of size n is an element that appears more than n/2 times 
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,1,1,1,5,1};
		int f = arr.length /2 ; 
		Set<Integer> mySet = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			int count = 1;
			// this can also be solved using single for loop and map
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count = count + 1;
				}
			}
			if(count > f){
				mySet.add(arr[i]);
			}
		}
		
		Iterator ite = mySet.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
