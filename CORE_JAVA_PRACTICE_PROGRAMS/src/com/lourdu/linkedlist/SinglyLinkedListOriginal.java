package com.lourdu.linkedlist;

public class SinglyLinkedListOriginal<T> {

    private int size;

    private MyNode head;

    private MyNode tail;

    public static void main(String[] args) {

        SinglyLinkedListOriginal linkedList = new SinglyLinkedListOriginal();

        // Add
        linkedList.add(5);
        System.out.println(linkedList.toString());
        linkedList.add(6);
        System.out.println(linkedList.toString());
        linkedList.add(7);
        System.out.println(linkedList.toString());

        // Insert at first
        System.out.println("list after inserting one element at first");
        linkedList.insertAtFirst(8);
        System.out.println(linkedList.toString());

        // Insert at last
        System.out.println("list after insertig one element at last");
        linkedList.insertAtLast(9);
        System.out.println(linkedList.toString());

        // Insert at 2nd position number 10
        System.out.println("list after inserting one element at positiong");
        linkedList.insertAtPosition(2, 10);
        System.out.println(linkedList.toString());

        // Delete from 1 position
        System.out.println("list after deleting one element at position");
        linkedList.deleteAtPosition(1);
        System.out.println(linkedList.toString());

        // size
        System.out.println("Size:" + linkedList.size());

        // swap 2 nodes
        linkedList.swapNodes(6, 10);
        System.out.println("list after swapping elements:" + linkedList.toString());

        // traverse the linkedlist
        linkedList.traverse();

        linkedList.rotateClockwiseBykNodes(3);
        System.out.println("List after rotating k nodes : " + linkedList.toString());

        // Reverse linkedList
        System.out.println("Reversed LinkedList: " + linkedList.reverseLinkedList());
    }

    private void rotateClockwiseBykNodes(int nodes) {

        int i = 0;
        while (i < nodes) {
            MyNode<T> temp = head.getNext();
            head.setNext(null);
            tail.setNext(head);
            tail = head;
            head = temp;

            i++;
            // or you can delete the tail and insert it at first. this continues
            // for 3 times.
        }

    }

    private void swapNodes(T i, T j) {

        if (i == j) {
            return;
        }

        MyNode<T> prex = null;
        MyNode<T> curx = head;
        while (curx != null && curx.getValue() != i) {
            prex = curx;
            curx = curx.getNext();
        }

        MyNode<T> prey = null;
        MyNode<T> cury = head;
        while (cury != null && cury.getValue() != j) {
            prey = cury;
            cury = cury.getNext();
        }

        if (curx == null || cury == null) {
            return;
        }

        if (prex != null) {
            prex.setNext(cury);
        }
        else {
            head = cury;
        }

        if (prey != null) {
            prey.setNext(curx);
        }
        else {
            head = curx;
        }

        // swap numbers

        MyNode<T> temp = curx.getNext();
        curx.setNext(cury.getNext());
        cury.setNext(temp);

    }

    private MyNode<T> reverseLinkedList() {

        MyNode<T> preveousNode = null;
        MyNode<T> currentNode = head;
        while (currentNode != null) {
            MyNode<T> temp = currentNode.getNext();
            currentNode.setNext(preveousNode);
            preveousNode = currentNode;
            currentNode = temp;
        }
        return preveousNode;
    }

    private void traverse() {

        if (head != null) {
            System.out.println("Traversing the linkedlist...");
            MyNode<T> temp = head;
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        }

    }

    private int size() {

        return size;
    }

    private void deleteAtPosition(int index) {

        if (head != null) {

            MyNode<T> temp = head;
            int a = 0;
            MyNode<T> nodeBeforeTheDeletedNode = head;
            while (temp.getNext() != null) {

                if (a == index) {
                    MyNode<T> nextNode = temp.getNext();

                    nodeBeforeTheDeletedNode.setNext(nextNode);
                    break;
                }
                else {
                    nodeBeforeTheDeletedNode = temp;
                    temp = temp.getNext();
                }
                a++;
            }
            // if linkedlist is containing only one node i.e head.
            if (temp.getNext() == null) {
                head = null;
            }
            size--;
        }
    }

    private void insertAtPosition(int index, T element) {

        MyNode<T> n = new MyNode<>();
        n.setValue(element);

        if (head != null) {
            MyNode<T> temp = head;
            int a = 0;
            while (temp.getNext() != null) {

                if (a == index) {
                    MyNode<T> previousNode = temp;
                    MyNode<T> nextNode = temp.getNext();

                    n.setNext(nextNode);
                    previousNode.setNext(n);
                    break;
                }
                else {
                    temp = temp.getNext();
                }
                a++;
            }
        }
        else {
            head = n;
            tail = n;
        }

        size++;

    }

    private void insertAtLast(T element) {

        MyNode<T> n = new MyNode<>();
        n.setValue(element);

        if (tail != null) {

            tail.setNext(n);
            tail = n;
        }
        else {

            head = n;
            tail = n;
        }

        size++;

    }

    private void insertAtFirst(T element) {

        // Check if head is not null to continue
        if (head != null) {

            // put current head value is temp Node to use later
            MyNode<T> temp = head;
            head = null;

            MyNode<T> n = new MyNode<>();
            n.setValue(element);
            n.setNext(temp);

            head = n;
        }
        else {
            MyNode<T> n = new MyNode<>();
            n.setValue(element);
            head = n;
            tail = n;
        }
        size++;

    }

    @Override
    public String toString() {
        return "SinglyLinkedListOriginal [head=" + head + ", tail=" + tail + "]";
    }

    private void add(T element) {

        MyNode n = new MyNode<>();
        n.setValue(element);
        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            tail = n;
        }

        size++;
    }

}
