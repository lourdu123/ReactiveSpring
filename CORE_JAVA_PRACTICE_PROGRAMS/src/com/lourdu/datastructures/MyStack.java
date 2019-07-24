package com.lourdu.datastructures;

import java.util.Arrays;

public class MyStack {

    static int[] arr = null;
    int stackSize = 0;

    public MyStack() {
        arr = new int[10];
        Arrays.fill(arr, -1);
    }

    public static void main(String[] args) {

        MyStack m = new MyStack();

        m.printStack();
        System.out.println("stack after printing.....");

        for (int i = 0; i < 15; i++) {
            m.push(i);
        }

        m.printStack();

        m.pop();
        m.pop();
        System.out.println("after poping elements......");
        m.printStack();

        System.out.println("peek element from arr: " + m.peek());

    }

    private void pop() {
        arr[stackSize - 1] = -1;
        stackSize--;
    }

    private int peek() {
        return arr[stackSize - 1];

    }

    private void push(int element) {

        if (stackSize == arr.length - 3) {
            increaseSizeOfArray();
        }
        arr[stackSize] = element;
        stackSize++;

    }

    private void increaseSizeOfArray() {
        arr = Arrays.copyOf(arr, arr.length * 2);
        for (int i = stackSize; i < arr.length; i++) {

            arr[i] = -1;

        }
        System.out.println("new arr size: " + arr.length);

    }

    private void printStack() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }
    }

}
