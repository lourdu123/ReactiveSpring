package com.lourdu.datastructures;

import java.util.Arrays;

public class MyQueue {

    static int[] arr = null;

    int queueSize = 0;
    int front = 0, rare = 0;

    public MyQueue() {
        arr = new int[10];
        Arrays.fill(arr, -1);
    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();

        for (int i = 0; i < 15; i++) {
            mq.add(i);
        }

        mq.printQueue();
        System.out.println("elements have been pushed to queue");

        mq.pop();
        mq.pop();

        mq.printQueue();

        System.out.println("the peek element is: " + mq.peek());

    }

    private int peek() {
        return arr[front];
    }

    private void pop() {
        arr[front] = -1;
        front++;
        queueSize--;

    }

    private void printQueue() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }

    }

    private void add(int element) {

        if (queueSize == arr.length - 3) {
            increaseQueueSize();
        }
        arr[rare] = element;
        rare++;
        queueSize++;

    }

    private void increaseQueueSize() {
        arr = Arrays.copyOf(arr, arr.length + 2);
        for (int i = queueSize; i < arr.length; i++) {
            arr[i] = -1;
        }

    }

}
