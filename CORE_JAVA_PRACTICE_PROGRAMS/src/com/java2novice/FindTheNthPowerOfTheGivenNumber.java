package com.java2novice;

public class FindTheNthPowerOfTheGivenNumber {
	
	
	
	public static void main(String[] args) {
		
		 int power = 3;
		 int number = 5;
         int powerValue = 1;
		for(int i=1;i<=power;i++){
			powerValue = powerValue * number;
		}	
		
		System.out.println("power value:"+powerValue);
	}

}
