package com.lourud.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flipkart2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		Scanner sc1 = new Scanner(str1);
		int count = 0;
		List<String> myList = new ArrayList<String>();

		while(sc1.hasNext()){
			if(Integer.parseInt(sc1.next()) == 2){
				myList.add("a2");
			}else if(Integer.parseInt(sc1.next()) == 3){
				myList.add("a3");
			}else if(Integer.parseInt(sc1.next()) == 4){
				myList.add("a4");
			}else if(Integer.parseInt(sc1.next()) == 5){
				myList.add("a5");
			}else if(Integer.parseInt(sc1.next()) == 6){
				myList.add("a6");
			}else if(Integer.parseInt(sc1.next()) == 7){
				myList.add("a7");
			}else if(Integer.parseInt(sc1.next()) == 8){
				myList.add("a8");
			}
			
		}
		

		char[] a2 = {'A','B','C'};
		char[] a3 = {'D','E','F'};
		char[] a4 = {'G','H','I'};
		char[] a5 = {'J','K','L'};
		char[] a6 = {'M','N','O'};
		char[] a7 = {'P','Q','R','S'};
		char[] a8 = {'T','U','V'};
		char[] a9 = {'W','X','Y','Z'};
		
		
		//String[] str = new String[8];

		
		for(int i=0;i<a2.length;i++){
			for(int j=0;j<a3.length;j++){
				for(int k=0;k<a4.length;k++){
					String s = "";
					s = s + a2[i]+a3[j]+a4[k];
					myList.add(s);		
				}
			}
		}
		
		System.out.println(myList);
	}
}
