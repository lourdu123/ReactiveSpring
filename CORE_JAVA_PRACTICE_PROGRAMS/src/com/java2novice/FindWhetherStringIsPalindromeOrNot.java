package com.java2novice;

public class FindWhetherStringIsPalindromeOrNot {

    public static void main(String[] args) {
        String s = "kitik";

        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }
        if (s.equals(temp)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
