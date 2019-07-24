package com.java2novice;

public class ReverseInteger {

    public static void main(String[] args) {
        int a = 516;
        int reverse = 0;

        while (a != 0) {
            reverse = (reverse * 10) + a % 10;
            a = a / 10;
        }

        System.out.println(reverse);
    }

}
