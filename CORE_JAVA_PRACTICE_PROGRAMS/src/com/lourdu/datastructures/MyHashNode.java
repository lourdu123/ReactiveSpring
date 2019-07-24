package com.lourdu.datastructures;

public class MyHashNode<k, v> {

    k key;
    v value;
    MyHashNode<k, v> next;

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public MyHashNode<k, v> getNext() {
        return next;
    }

    public void setNext(MyHashNode<k, v> next) {
        this.next = next;
    }

}
