package com.lourdu.linkedlist;

public class CircularLinkedList<T> {

    int size;
    MyNode<T> head;
    MyNode<T> tail;

    @Override
    public String toString() {
        return "CircularLinkedList [size=" + size + ", head=" + head + "]";
    }

    public static void main(String[] args) {

        CircularLinkedList linkedList = new CircularLinkedList();

        // Add
        linkedList.add(5);
        System.out.println(linkedList.toString());
        linkedList.add(6);
        System.out.println(linkedList.toString());
        linkedList.add(7);
        System.out.println(linkedList.toString());

        // size
        // System.out.println("Size:" + linkedList.size());
        //

        // traverse the circularlinkedlist
        // linkedList.traverse();

        // Search circularlinkedList
        System.out
                .println("Check if given node is there in the circular linked list:"
                        + linkedList.searchLinkedList(8));
    }

    private boolean searchLinkedList(T value) {

        if (head == null) {
            return false;
        }
        else {
            MyNode<T> temp = head;
            while (temp.getValue() != value) {
                temp = temp.getNext();
            }

            if (temp.getValue() == value) {
                return true;
            }
            else {
                return false;
            }
        }

    }

    private void add(T data) {

        MyNode n = new MyNode();
        n.setValue(data);
        n.setNext(head);
        if (head == null)
        {
            head = n;
        }
        else
        {
            head = n;
        }

    }

}
