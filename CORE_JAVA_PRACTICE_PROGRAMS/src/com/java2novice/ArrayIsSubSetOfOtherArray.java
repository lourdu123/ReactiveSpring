package com.java2novice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ArrayIsSubSetOfOtherArray {

    public static void main(String[] args) {
        int arr1[] = {11, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        Map<Integer, String> myMap = new HashMap<Integer, String>();

        for (int k = 0; k < arr2.length; k++) {
            myMap.put(arr2[k], "false");
        }

        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {

                if (arr2[i] == arr1[j]) {
                    if (myMap.get(arr2[i]).equals("false")) {
                        myMap.put(arr2[i], "true");
                    }
                }
                else {
                    if (myMap.get(arr2[i]).equals("true")) {

                    }
                    else {
                        myMap.put(arr2[i], "false");

                    }
                }
            }

        }
        System.out.println(myMap);
        Collection<String> myList = new ArrayList<String>();
        myList = myMap.values();
        boolean b = myList.contains("false");
        System.out.println(b);
        if (b == true) {
            System.out.println("is not a sub set");
        }
        else {
            System.out.println("is a subset");
        }
        // for(String value:myList){
        // if(value.equals("false")){
        // System.out.println("is not a subset");
        // }
        // }
        // if(isSubset(arr1, arr2, m, n))
        // System.out.println("arr2[] is subset of arr1[] ");
        // else
        // System.out.println("arr2[] is not a subset of arr1[]");
    }

    public static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                if (arr2[i] == arr1[j])
                    break;
            }

            /* If the above inner loop was not broken at all then
            arr2[i] is not present in arr1[] */
            if (j == m)
                return false;
        }

        /* If we reach here then all elements of arr2[] 
        are present in arr1[] */
        return true;
    }
}
