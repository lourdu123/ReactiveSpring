package com.lourud.arrays;

public class SortingAnArray {
	
	public static void main(String[] args) {
		int[] arr = {3,5,1,2,7};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int  temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}

}
