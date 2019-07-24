package com.lourud.arrays;


import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 10, 30, 40, 40};

        /* int[] temp = {10, 20, 10, 30, 40};

         for (int i = 0; i < arr.length; i++) {

             for (int j = i + 1; j < temp.length; j++) {

                 if (arr[i] == temp[j]) {

                     arr = ArrayUtils.remove(temp, j);
                     temp = arr;
                 }

             }
         }*/

        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (myMap.get(arr[i]) == null) {
                myMap.put(arr[i], 1);
            }
            else {
                arr = ArrayUtils.remove(arr, i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
