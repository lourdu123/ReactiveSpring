package com.java2novice;

public class FindWhetherGivenNumberIsPowerOf2 {

    public static void main(String[] args) {
        int a = 64;

        while (a != 2 && a % 2 == 0) {
            a = a / 2;
        }
        if (a == 2) {
            System.out.println("is a power of 2");
        }
        else {
            System.out.println("not a power of 2");
        }

    }

}
