package com.lourdu.linkedlist;

public class DoublyLinkedListOriginal<T> {

    private int size;

    private DoubledNode<T> head;

    private DoubledNode<T> tail;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoubledNode<T> getHead() {
        return head;
    }

    public void setHead(DoubledNode<T> head) {
        this.head = head;
    }

    public DoubledNode<T> getTail() {
        return tail;
    }

    public void setTail(DoubledNode<T> tail) {
        this.tail = tail;
    }

    public static void main(String[] args) {

        DoublyLinkedListOriginal dll = new DoublyLinkedListOriginal<>();

        // add element 5 at the end
        dll.add(5);
        dll.printElements();
        System.out.println("-----------------");

        // add element 5 at the end
        dll.add(6);
        dll.printElements();
        System.out.println("-----------------");

        // add element 5 at the end
        dll.add(7);
        dll.printElements();
        System.out.println("-----------------");

        System.out.println("Removing element:" + dll.remove(6));
        System.out.println("-----------------");
        dll.printElements();
        System.out.println("-----------------");

        System.out.println("adding element at specific index");
        dll.addAtSpecificIndex(1, 11);
        dll.printElements();
        System.out.println("-----------------");

        System.out.println("Reverse list elements");
        dll.reverseElement();

    }

    private void reverseElement() {

        if (tail == null) {
            return;
        }

        DoubledNode<T> temp = tail;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getPrevious();
        }

    }

    private void printElements() {

        if (head == null) {
            return;
        }

        DoubledNode<T> temp = head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }

    }

    private void addAtSpecificIndex(int index, T element) {

        if (head == null) {
            return;
        }

        DoubledNode<T> n = new DoubledNode<>();
        n.setData(element);

        int indexValue = 0;
        DoubledNode<T> temp = head;
        DoubledNode<T> currentNode = null;

        while (indexValue != index) {
            currentNode = temp;
            temp = temp.getNext();
            indexValue++;
        }
        n.setNext(currentNode.getNext());
        n.setPrevious(currentNode);
        currentNode.getNext().setPrevious(n);
        currentNode.setNext(n);

        size++;
    }

    @Override
    public String toString() {
        return "DoublyLinkedListOriginal [size=" + size + ", head=" + head.getData() +
                ", tail=" + tail.getData() + "]";
    }

    private int remove(T element) {

        DoubledNode<T> temp = head;
        DoubledNode<T> previousNode = null;
        DoubledNode<T> currentNode = null;

        if (temp == null) {
            return 0;
        }
        while (temp != null && temp.getData() != element) {
            previousNode = temp.getPrevious();
            currentNode = temp;
            temp = temp.getNext();
        }
        currentNode.setNext(temp.getNext());
        temp.getNext().setPrevious(currentNode);

        size--;
        return (int) temp.getData();
    }

    private void add(T data) {

        DoubledNode<T> n = new DoubledNode<>();
        n.setData(data);

        if (head == null) {
            head = n;
            tail = n;

        }
        else {
            n.setPrevious(tail);
            tail.setNext(n);

            tail = n;
        }

        size++;
    }

}
