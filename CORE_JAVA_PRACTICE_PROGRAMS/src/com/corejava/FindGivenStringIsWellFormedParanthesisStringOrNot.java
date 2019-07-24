package com.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FindGivenStringIsWellFormedParanthesisStringOrNot {

    public static void main(String[] args) {

        System.out.println(checkValidity("(){}[]"));
        System.out.println(checkValidity("()}[]"));
        System.out.println(checkValidity("({}[])"));
        System.out.println(checkValidity("({})[]"));
        System.out.println(checkValidity("({})([])"));
        System.out.println(checkValidity("({})([]"));
    }

    private static boolean checkValidity(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            char braceType = s.charAt(i);
            if (map.keySet().contains(braceType)) {
                stack.push(braceType);
            }

            if (map.values().contains(braceType)) {

                if (!stack.isEmpty() && map.get(stack.peek()) == braceType) {
                    stack.pop();

                }
                else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
