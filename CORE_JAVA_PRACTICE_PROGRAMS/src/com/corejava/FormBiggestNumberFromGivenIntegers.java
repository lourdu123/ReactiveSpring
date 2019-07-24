package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FormBiggestNumberFromGivenIntegers {

    public static void main(String[] args) {

        List<Integer> finalList = new ArrayList<>();

        List<String> list = new ArrayList<>();
        list.add("7"); 
        list.add("9"); 
        list.add("98"); 
        list.add("1"); 
        
        // please read from here https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
        Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String xy = o1+o2;
				String yx = o2+o1;
				return yx.compareTo(xy);
			}
        	
		});
        System.out.println("finalList:" + list);
    }
}
