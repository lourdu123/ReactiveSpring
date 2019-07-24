package com.corejava.mapsortbykeyandvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByPrimitiveValue {

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
        System.out.println(m.toString());
        // printMap(m);

        Map<Integer, String> sortedMap = sortByValue(m);

        System.out.println("************After sorting***************");
        // printMap(sortedMap);
        System.out.println(sortedMap.toString());
    }

    private static Map<Integer, String> sortByValue(Map<Integer, String> m) {

        // Convert map entries to list, because Collections.sort() accepts only
        // list...
        List<Entry<Integer, String>> list = new ArrayList(m.entrySet());

        Collections.sort(list, new Comparator<Entry<Integer, String>>() {

            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }

        });

        // Create linkedhashmap to put entries, because it persist the insertion
        // order
        Map<Integer, String> linkedSortedHashMap = new LinkedHashMap<Integer, String>();

        Iterator i = list.iterator();
        while (i.hasNext()) {
            Entry<Integer, String> entry = (Entry<Integer, String>) i.next();
            linkedSortedHashMap.put(entry.getKey(), entry.getValue());
        }

        // finally return the sortedlinkedhashmap
        return linkedSortedHashMap;
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
