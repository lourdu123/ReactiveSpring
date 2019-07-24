package com.lourdu.datastructures;

import java.util.ArrayList;

public class MyHashTable<k, v> {

    private ArrayList<MyHashNode<k, v>> list = null;

    int listCapacity;
    static int size;

    public MyHashTable(int size) {
        list = new ArrayList<>(size);
        listCapacity = size;
        size = 0;

        for (int i = 0; i < listCapacity; i++) {
            list.add(null);
        }
    }

    public static void main(String[] args) {

        MyHashTable mt = new MyHashTable(10);

        mt.add(5, "lourdu");
        mt.add(1, "reddy");
        mt.add(10, "ponnapati");
        mt.add(6, "ajay");
        mt.add(11, "mohan");
        mt.add(2, "ram");
        mt.add(55, "hemant");
        mt.add(1, "sujith");
        mt.add(19, "ajith");
        mt.add(57, "ganta");
        mt.add(18, "balu");
        mt.add(97, "yennam");

        System.out.println("size is: " + size);
    }

    private void add(k key, v value) {

        int bucketLocation = getBucketLocation(key);

        // check if any bucket location contains the entry
        MyHashNode<k, v> node = list.get(bucketLocation);

        // check if given key is already exist in any linkedlist chain
        while (node != null) {
            if (node.getKey().equals(key)) {
                node.setValue(value);
                return;
            }
            node = node.getNext();
        }

        size++;
        MyHashNode<k, v> newEntry = new MyHashNode<>();
        newEntry.setKey(key);
        newEntry.setValue(value);

        // get the head of the chain
        node = list.get(bucketLocation);

        newEntry.setNext(node);
        list.set(bucketLocation, newEntry);

        // If load factor goes beyond threshold, then
        // double hash table size
        if (size / listCapacity == 0.7) {

            ArrayList<MyHashNode<k, v>> temp = list;
            listCapacity = 2 * listCapacity;
            size = 0;

            list = new ArrayList<>(listCapacity);

            for (int i = 0; i < listCapacity; i++) {
                list.add(null);
            }

            for (MyHashNode<k, v> head: temp) {
                while (head != null) {
                    add(head.getKey(), head.getValue());
                    head = head.getNext();
                }
            }

        }

    }

    private int getBucketLocation(k key) {

        int hashCode = key.hashCode();
        int bucketLocation = hashCode % listCapacity;
        return bucketLocation;

    }
}
