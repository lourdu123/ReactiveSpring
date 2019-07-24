package com.lourud.arrays;

public class FindAPairInArrayWhichEqualsToGivenNumber {

	public static void main(String[] args) {
		int[] arr = {1,3,7,2,4};
		findThePairs(arr,5);
	}

	private static void findThePairs(int[] arr, int element) {
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(i+j == element){
					System.out.println("the pair is:"+i+"-"+j);
				}
			}
		}
		
		
	}
}
