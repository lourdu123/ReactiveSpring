package com.lourdu.linkedlist;

public class DoubledNode<T> {

    DoubledNode previous;
    T data;
    DoubledNode next;

    public DoubledNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubledNode previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubledNode getNext() {
        return next;
    }

    public void setNext(DoubledNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoubledNode [previous=" + previous + ", data=" + data + ", next="
                + next + "]";
    }

}
