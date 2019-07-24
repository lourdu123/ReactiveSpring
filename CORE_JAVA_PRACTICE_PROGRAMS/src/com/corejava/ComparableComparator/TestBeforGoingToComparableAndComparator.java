package com.corejava.ComparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestBeforGoingToComparableAndComparator {

    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 7;
        a[1] = 1;
        a[2] = 6;
        a[3] = 2;
        a[4] = 3;

        Arrays.sort(a);
        for (int x: a) {
            System.out.println(x);
        }

        System.out.println("_______________________________________");

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(8);
        myList.add(5);
        myList.add(1);
        myList.add(11);

        Collections.sort(myList);
        System.out.println(myList.toString());

    }

}
