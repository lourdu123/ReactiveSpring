package com.pyramid_patterns;

import java.util.Scanner;

public class PyramidPattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();
        System.out.println("number entered is:" + number);

        for (int i = 1; i <= number; i++) {
            // this loop will print the spaces after which the
            // number has to be printed
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            // this loop will print the number
            for (int k = 0; k < i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        System.out.println("---------------");

        for (int i = 1; i <= number; i++) {
            // this loop will print the spaces after which the
            // number has to be printed
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            // this loop will print the number
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("---------------");

        for (int i = 1; i <= number; i++) {
            // this loop will print the spaces after which the
            // number has to be printed
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            // this loop will print the number
            for (int k = 1; k < i; k++) {

                System.out.print(k + " ");
            }
            System.out.println();

        }

        System.out.println("---------------");

        for (int i = 1; i <= number; i++) {

            // this loop will print the number
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }

        System.out.println("---------------");

        for (int i = 1; i <= number; i++) {

            // this loop will print the spaces after which the
            // number has to be printed
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            // this loop will print the number
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();

        }

        System.out.println("---------------");

        for (int i = number; i >= 1; i--) {

            // this loop will print the spaces after which the
            // number has to be printed
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            // this loop will print the number
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }

            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();

        }

    }

}
