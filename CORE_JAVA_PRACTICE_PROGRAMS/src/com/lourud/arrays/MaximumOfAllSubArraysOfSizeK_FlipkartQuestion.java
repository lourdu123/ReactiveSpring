package com.lourud.arrays;

import java.util.Arrays;

public class MaximumOfAllSubArraysOfSizeK_FlipkartQuestion {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int subArray = 3;
		
		
		for(int i=0; i<= arr.length-subArray;i++){
			
			    int count = 0;
			    int[] temp = new int[3];
			    // you can use Arrays.copyOfRange() Method or use the logic which I have written
				//temp = Arrays.copyOfRange(arr,i,i+3);
			    for(int m=0; m <= arr.length-subArray;m++){
			    	if(i == 0){
			    		count = count + 1;
			    		temp[m] = arr[m];
			    	}else{
			    		count = count + 1;
			    		temp[m] = arr[m+i];
			    	}
			    	
			    	if(count >= 3){
			    		break;
			    	}
			    	
			    }
			
				for(int k=0;k<temp.length;k++){
					
					for(int j=k+1;j<temp.length;j++){
						
						if(temp[k] > temp[j]){
							int temp1 = temp[j];
							temp[j] = temp[k];
							temp[k] = temp1;
							
						}
					}
				}
				
				System.out.println(temp[temp.length-1]);
				
		}
		
		
	}
}
