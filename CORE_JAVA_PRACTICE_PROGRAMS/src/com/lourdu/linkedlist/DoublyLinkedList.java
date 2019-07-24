package com.lourdu.linkedlist;

class Node7 {

    int data;
    Node7 next, previous;

    public Node7(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {

    private static Node7 head;

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        Node7 n1 = new Node7(6);
        Node7 n2 = new Node7(7);
        Node7 n3 = new Node7(8);

        dll.head = n1;
        dll.head.next = n2;
        dll.head.next.previous = head;
        dll.head.next.next = n3;
        dll.head.next.next.previous = n2;

        dll.printDoublyLinkedList();

        System.out.println("----------");
        dll.addNodeAtFront(5);
        dll.printDoublyLinkedList();

        System.out.println("----------");
        dll.addNodeAtLast(9);
        dll.printDoublyLinkedList();

        System.out.println("----------");
        dll.insertAfter(1, 10);
        dll.printDoublyLinkedList();

        System.out.println("----------");
        dll.deleteNode(8);
        dll.printDoublyLinkedList();
    }

    private void deleteNode(int i) {

        Node7 n = new Node7(i);

        if (head == null) {
            return;
        }

        Node7 h = head;
        Node7 temp = null;
        while (h != null) {
            // if(h.next == ){
            //
            // }
            h = h.next;
        }

    }

    private void insertAfter(int index, int j) {

        Node7 node = new Node7(j);

        int count = 0;
        Node7 n = head;
        Node7 current = null;
        Node7 after = null;
        while (n != null) {
            if (count == 1) {
                current = n;
                after = n.next;
                break;
            }
            else {
                n = n.next;
                count = count + 1;
            }

        }

        // System.out.println("current:"+current);
        current.next = node;
        after.previous = node;
        node.previous = current;
        node.next = after;

    }

    private void addNodeAtLast(int i) {

        Node7 node7 = new Node7(i);

        Node7 h = head;
        while (h.next != null) {
            h = h.next;
        }

        h.next = node7;
        node7.previous = h;

    }

    private void printDoublyLinkedList() {

        Node7 h = head;
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }

    private void addNodeAtFront(int data) {

        Node7 n = new Node7(data);
        if (head == null) {
            head = n;
        }
        else {
            Node7 temp = head;
            temp.previous = n;
            head = n;
            head.next = temp;
        }

    }

}
