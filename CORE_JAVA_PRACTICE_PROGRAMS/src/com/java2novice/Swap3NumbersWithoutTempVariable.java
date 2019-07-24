package com.java2novice;

public class Swap3NumbersWithoutTempVariable {

	public static void main(String[] args) {
		int a=5; // 7
		int b=6; // 5
		int c=7; // 6
		
		a = a+b+c; // 18
		b = a - (b+c); // 5
		c = a - (b+c); // 6
		a = a - (b+c); // 7
		
		System.out.println("a:"+a+", b:"+b+", c:"+c);
	}
	
	
	
}
