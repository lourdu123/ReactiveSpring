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

public class SortMapByObjectValue {

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

        Map<Integer, Person> personsMap = new HashMap<Integer, Person>();
        personsMap.put(3, p);
        personsMap.put(7, p1);
        personsMap.put(1, p2);

        printMap(personsMap);
        System.out.println("********************");
        Map<Integer, Person> mapSortByID = sortByObjectIDValue(personsMap);
        printMap(mapSortByID);
        System.out.println("********************");
        Map<Integer, Person> mapSortByName = sortByObjectNameValue(personsMap);
        printMap(mapSortByName);

    }

    private static Map<Integer, Person> sortByObjectNameValue(Map<Integer, Person> m) {

        List<Entry<Integer, Person>> mapList = new ArrayList(m.entrySet());

        Collections.sort(mapList, new Comparator<Entry<Integer, Person>>() {

            @Override
            public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }

        });

        Map<Integer, Person> sortedMap = new LinkedHashMap();

        Iterator i = mapList.iterator();
        while (i.hasNext()) {
            Entry<Integer, Person> entry = (Entry<Integer, Person>) i.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    private static Map<Integer, Person> sortByObjectIDValue(Map<Integer, Person> m) {

        List<Entry<Integer, Person>> mapList = new ArrayList(m.entrySet());

        Collections.sort(mapList, new Comparator<Entry<Integer, Person>>() {

            @Override
            public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {

                return o1.getValue().getId() - o2.getValue().getId();
            }

        });

        Map<Integer, Person> sortedMap = new LinkedHashMap();

        Iterator i = mapList.iterator();
        while (i.hasNext()) {
            Entry<Integer, Person> entry = (Entry<Integer, Person>) i.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    private static void printMap(Map<Integer, Person> m) {

        Set<Entry<Integer, Person>> entrySet = m.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<Integer, Person> entry = (Entry<Integer, Person>) it.next();
            System.out.println("key:" + entry.getKey().toString() + " , Value:" + entry.getValue());
        }
    }

}
