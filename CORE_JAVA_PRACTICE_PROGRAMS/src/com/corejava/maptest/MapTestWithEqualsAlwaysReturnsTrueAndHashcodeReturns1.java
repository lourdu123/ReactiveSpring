package com.corejava.maptest;

import java.util.HashMap;
import java.util.Map;

public class MapTestWithEqualsAlwaysReturnsTrueAndHashcodeReturns1 {

    public static void main(String[] args) {

        Map<Fruit, Integer> myMap = new HashMap<>();
        Fruit f1 = new Fruit();
        f1.setName("apple");

        Fruit f2 = new Fruit();
        f2.setName("banana");

        Fruit f3 = new Fruit();
        f3.setName("apple");

        myMap.put(f1, 3);
        myMap.put(f2, 2);
        myMap.put(f3, 4);

        System.out.println(myMap.size());
        System.out.println(myMap);

        System.out.println(myMap.get(f1));
        System.out.println(myMap.get(f2));
    }
}
