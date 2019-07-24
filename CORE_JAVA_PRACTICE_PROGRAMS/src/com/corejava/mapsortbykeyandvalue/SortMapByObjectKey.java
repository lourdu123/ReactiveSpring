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

public class SortMapByObjectKey {

    public static void main(String[] args) {

        Person p = new Person();
        p.setId(5);
        p.setName("Raghav");

        Person p1 = new Person();
        p1.setId(1);
        p1.setName("Aaghav");

        Person p2 = new Person();
        p2.setId(7);
        p2.setName("Baghav");

        Map<Person, Integer> personsMap = new HashMap<Person, Integer>();
        personsMap.put(p, 3);
        personsMap.put(p1, 7);
        personsMap.put(p2, 1);

        printMap(personsMap);
        System.out.println("********************");
        Map<Person, Integer> mapSortByID = sortByObjectIDKey(personsMap);
        printMap(mapSortByID);
        System.out.println("********************");
        Map<Person, Integer> mapSortByName = sortByObjectNameKey(personsMap);
        printMap(mapSortByName);

    }

    private static Map<Person, Integer> sortByObjectNameKey(Map<Person, Integer> m) {

        List<Entry<Person, Integer>> mapList = new ArrayList(m.entrySet());

        Collections.sort(mapList, new Comparator<Entry<Person, Integer>>() {

            @Override
            public int compare(Entry<Person, Integer> o1, Entry<Person, Integer> o2) {

                return o1.getKey().getName().compareTo(o2.getKey().getName());
            }

        });

        Map<Person, Integer> sortedMap = new LinkedHashMap();

        Iterator i = mapList.iterator();
        while (i.hasNext()) {
            Entry<Person, Integer> entry = (Entry<Person, Integer>) i.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    private static Map<Person, Integer> sortByObjectIDKey(Map<Person, Integer> m) {

        List<Entry<Person, Integer>> mapList = new ArrayList(m.entrySet());

        Collections.sort(mapList, new Comparator<Entry<Person, Integer>>() {

            @Override
            public int compare(Entry<Person, Integer> o1, Entry<Person, Integer> o2) {

                return o1.getKey().getId() - o2.getKey().getId();
            }

        });

        Map<Person, Integer> sortedMap = new LinkedHashMap();

        Iterator i = mapList.iterator();
        while (i.hasNext()) {
            Entry<Person, Integer> entry = (Entry<Person, Integer>) i.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    private static void printMap(Map<Person, Integer> m) {

        Set<Entry<Person, Integer>> entrySet = m.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<Person, Integer> entry = (Entry<Person, Integer>) it.next();
            System.out.println("key:" + entry.getKey().toString() + " , Value:" + entry.getValue());
        }
    }
}
