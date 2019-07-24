package com.lourud.arrays;

public class RotateAnArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		// Rotate array by 3 elements
		
		for(int i=0;i<3;i++){
			int temp = arr[0];
			for(int j=1;j<arr.length;j++){
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = temp;
		}
		
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}
}
