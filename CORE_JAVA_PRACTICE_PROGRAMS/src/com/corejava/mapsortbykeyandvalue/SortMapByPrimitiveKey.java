package com.corejava.mapsortbykeyandvalue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByPrimitiveKey {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();
        m.put(12, "B");
        m.put(3, "C");
        m.put(4, "D");
        m.put(55, "E");
        m.put(19, "A");
        m.put(67, "M");
        m.put(7, "N");
        m.put(99, "Z");

        System.out.println("Before sorting");
        // System.out.println(m.toString());
        printMap(m);

        Map<Integer, String> sortedMap = new TreeMap<>(m);

        System.out.println("************After sorting***************");
        printMap(sortedMap);
    }

    private static void printMap(Map<Integer, String> m) {

        Set<Entry<Integer, String>> entrySet = m.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
            System.out.println("key:" + entry.getKey() + " , Value:" + entry.getValue());
        }
    }

}
