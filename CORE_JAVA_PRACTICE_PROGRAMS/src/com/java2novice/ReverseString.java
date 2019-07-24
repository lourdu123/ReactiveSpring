package com.java2novice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "lourdu";
		int len = str.length();
		String temp = "";
		for(int i=len-1; i >= 0; i--){
			temp = temp + str.charAt(i);
		}
		
		System.out.println(temp);
	}
	
}
