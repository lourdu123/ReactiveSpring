package com.lourud.arrays;

public class ProgramToReverseAnArray {

    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int length = arr.length;
        int arrIndex = length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (i <= arrIndex) {

                int temp = arr[i];
                arr[i] = arr[arrIndex];
                arr[arrIndex] = temp;

                arrIndex = arrIndex - 1;;
            }

        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
