package com.lourdu.datastructures;

import com.lourdu.Node6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindBinaryTreeShortestAndLongestPath {

    static Node6 root;
    static int[] arr = new int[1000];
    static int len = 0;
    static Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();

    public static void main(String[] args) {

        FindBinaryTreeShortestAndLongestPath papbn = new FindBinaryTreeShortestAndLongestPath();
        papbn.root = new Node6(10);
        papbn.root.left = new Node6(8);
        papbn.root.right = new Node6(2);
        papbn.root.left.left = new Node6(3);
        papbn.root.left.right = new Node6(5);
        papbn.root.right.left = new Node6(2);

        findAllPaths(root, arr, len);
        Set<Integer> keys = myMap.keySet();
        List<Integer> myKeysList = new ArrayList<Integer>();
        myKeysList.addAll(keys);
        Collections.sort(myKeysList);
        int minKey = 0;
        int maxKey = 0;
        for (int i = 0; i < myKeysList.size(); i++) {
            // System.out.println("myKeysList"+myKeysList.get(i));
            if (i == 0) {
                minKey = myKeysList.get(i);
            }
            maxKey = myKeysList.get(i);
        }

        System.out.println("shortest path:" + myMap.get(minKey));
        System.out.println("longest path:" + myMap.get(maxKey));

    }

    private static void findAllPaths(Node6 root2, int[] arr, int len) {

        if (root2 == null) {
            return;
        }

        arr[len] = root2.data;
        len++;

        if (root2.left == null && root2.right == null) {
            printPath(arr, len);
        }

        findAllPaths(root2.left, arr, len);
        findAllPaths(root2.right, arr, len);
    }

    private static void printPath(int[] arr2, int len2) {

        int current = 0;
        List<Integer> myPathLengths = new ArrayList<Integer>();

        for (int i = 0; i < len2; i++) {
            myPathLengths.add(arr2[i]);
            current = current + arr[i];

        }
        myMap.put(current, myPathLengths);
    }

}
