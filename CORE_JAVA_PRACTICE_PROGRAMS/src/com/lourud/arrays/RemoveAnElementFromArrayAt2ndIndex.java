package com.lourud.arrays;


public class RemoveAnElementFromArrayAt2ndIndex {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 9;

        // before removing elements
        System.out.println("before removing elements");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (i >= 2) {
                arr[i] = arr[i + 1];
            }
            if (i + 1 == arr.length - 1) {
                arr[i + 1] = 0;
            }
            /*if (i == 2) {
                arr = ArrayUtils.remove(arr, i); // ArrayUtils remove method will reduce the size of the array...
            }*/

        }

        // after removing elements
        System.out.println("after removing elements");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

}
