package com.lourud.arrays;

public class FindMiddleIndexWhereSumOfBothEndsAreEqual {

	public static void main(String[] args) {
		int[] arr = {2, 4, 4, 3, 5, 4, 1};
		if(arr.length > 2){
			for(int i=1;i<arr.length;i++){
				int after = 0;
				int before = 0;

				//System.out.println(i);
				for(int j=i+1;j<arr.length;j++){
					 after = after + arr[j];
				}
				for(int k=i-1;k >= 0;k--){
					  before = before + arr[k];
				}
				if(after == before){
					System.out.println(i+" index element");
				}
			}
		}
	}
}
