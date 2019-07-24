package com.java2novice;

import java.util.Scanner;

public class PrintFirst100PrimeNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter how many primes you want to print :");
		Scanner sc = new Scanner(System.in);
		int numberOfPrimes = sc.nextInt();
		
		int count = 0;
		int num = 2;
		
		System.out.println("you entered :"+ numberOfPrimes);
		while(count < numberOfPrimes){
			boolean isPrime = true;
			for(int i = 2; i <= Math.sqrt(num); i++){
				if(num%i == 0 ){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime){
				count++;
				System.out.println(num);
			}
			
			num++;
		}
	}
}
