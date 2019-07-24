package com.java2novice;

public class FindGivenNumberIsPrimeOrNot {

    public static void main(String[] args) {
        int num = 249;
        boolean flag = false;

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("its not prime.." + i);
                flag = true;
                break;
            }

        }

        if (!flag) {
            System.out.println("its prime");
        }
    }

}
