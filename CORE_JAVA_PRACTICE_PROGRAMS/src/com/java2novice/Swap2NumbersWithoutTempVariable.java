package com.java2novice;

public class Swap2NumbersWithoutTempVariable {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a:"+a+", b:"+b);
		
	}

}
