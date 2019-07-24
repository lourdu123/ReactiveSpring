package com.java2novice;

public class FindTheFactorialOfTheNumber {

    // static int result;

    public static void main(String[] args) {
        int a = 5;
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
         int x = findFactorial(5);

    }

     private static int findFactorial(int i) {
         if (i == 1) {
             return 1;
         }
         return findFactorial(i - 1) * i;
     }
}
