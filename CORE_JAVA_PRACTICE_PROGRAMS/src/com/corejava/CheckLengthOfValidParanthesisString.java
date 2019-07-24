package com.corejava;

import java.util.Stack;

public class CheckLengthOfValidParanthesisString {

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("()"));
        System.out.println(longestValidParentheses("())"));
        System.out.println(longestValidParentheses("(())"));
        System.out.println(longestValidParentheses("()()()"));
        System.out.println(longestValidParentheses("(()()"));
    }

    public static int longestValidParentheses(String s) {

        int maxLen = 0;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {

                stack.push(s.charAt(i));
            }
            else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    maxLen = maxLen + 2;
                }
            }
        }

        return maxLen;

    }
}
