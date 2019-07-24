package com.java2novice;

public class FindArrayElementsThatDevideTheSumOfAllOtherElements {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int size = a.length;
		// below method works if the elements are consecutive positive integers starting from 1
		int sum = (size*(size+1))/2;
		
		for(int ele:a){
			if((sum-ele) % ele == 0){
				System.out.println(ele);
			}
		}
	}
}
