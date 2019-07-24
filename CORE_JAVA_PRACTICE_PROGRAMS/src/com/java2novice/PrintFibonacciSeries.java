package com.java2novice;

public class PrintFibonacciSeries {
	
	public static void main(String[] args) {
		
		int[] arr = new int[25];
		
		
		for(int i=0;i<arr.length;i++){
			
			if(i == 0){
				arr[0] = 1;
			}else if(i == 1){
				arr[i] = 1;
			}else{
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}
