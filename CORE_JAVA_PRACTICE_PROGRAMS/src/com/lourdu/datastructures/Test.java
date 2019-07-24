package com.lourdu.datastructures;

import java.util.Scanner;

public class Test {

	int value = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		 int[] arr = null;
		    int a = 0;
		    int lastIndex=0;
			Scanner sc = new Scanner(System.in);
			int testcase = sc.nextInt();
			Scanner sc1 = new Scanner(System.in);
			String str1 = sc1.nextLine();
			Scanner sc2 = new Scanner(str1);
			int count = 0;
			int count1 = 0;
			while(sc2.hasNext()){
			    if(count == 0){
			        arr = new int[Integer.parseInt(sc2.next())]; 
			    }else{
			        a = Integer.parseInt(sc2.next());
			    }
			   count = count + 1;
			}
			
			Scanner sc3 = new Scanner(str1);
			String s = sc1.nextLine();
			Scanner sc4 = new Scanner(s);
			while(sc4.hasNext()){
			    
			      arr[count1] = Integer.parseInt(sc4.next()); 
			      count1 = count1 + 1;
			}
			
			for(int k=0;k<arr.length;k++){
				if(arr[k] == a){
					arr[k] = a+a;
					a = a+a;
					lastIndex = k;
				}
			}
			System.out.println("value:"+arr[lastIndex]);
			
			
			
		
	}
}
