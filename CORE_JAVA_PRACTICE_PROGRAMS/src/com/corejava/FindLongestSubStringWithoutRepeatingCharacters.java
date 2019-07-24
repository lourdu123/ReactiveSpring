package com.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindLongestSubStringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        // Given a string, find the length of the longest substring without
        // repeating characters.
        // For example, the longest substring without repeating letters for
        // "abcabcbb" is "abc", which the length is 3.
        // For "bbbbb" the longest substring is "b", with the length of 1.
    	// please visit below website
    	// https://www.baeldung.com/java-longest-substring-without-repeated-characters

   	
    	// https://www.baeldung.com/java-longest-substring-without-repeated-characters
    	// 2 for loops
    	//System.out.println(test("ABCA"));
    	
    	// single for loop
    	System.out.println(test2("ABCA"));

    }

	private static String test2(String input) {
		Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    int j = 0;
	    for (int i = 0; i < input.length(); i++) {
	        char currChar = input.charAt(i);
	        if (visited.containsKey(currChar)) {
	            j = Math.max(visited.get(currChar)+1, j);
	        }
	        if (output.length() < i - j + 1) {
	            output = input.substring(j, i + 1);
	        }
	        visited.put(currChar, i);
	    }
	    return output;
	}

	private static String test(String input) {
		String output = "";
	    for (int i = 0; i < input.length(); i++) {
	        Set<Character> visited = new HashSet<>();
	        int j = i;
	        for (; j < input.length(); j++) {
	            char currChar = input.charAt(j);
	            if (visited.contains(currChar)) {
	                break;
	            } else {
	                visited.add(currChar);
	            }
	        }
	        if (output.length() < j - i + 1) {
	            output = input.substring(i, j);
	        }
	        
	        // we can replace above if condition with below
	       /* if (output.length() < visited.size()) {
	            output = input.substring(i, j);
	        }*/
	    }
	    return output;
		
	}
}
