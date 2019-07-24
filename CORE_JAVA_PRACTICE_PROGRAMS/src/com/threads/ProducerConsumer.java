package com.threads;

import java.util.Stack;

public class ProducerConsumer {

    Stack stack = new Stack<>();
    private int stackSize = 4;

    public void produce(int a) {

        while (true) {

            synchronized(stack) {
                if (stack.size() == stackSize) {
                    try {
                        System.out.println("stack is full. so waiting");
                        stack.wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    stack.push(a);
                    System.out.println("stack size after pushing up data:" + stack.size());
                    stack.notify();
                }

            }

        }
    }

    public void consume() {

        while (true) {

            synchronized(stack) {
                if (stack.size() == 0) {
                    try {
                        stack.wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    stack.pop();
                    System.out.println("stack size after poping up data:" + stack.size());
                    stack.notifyAll();

                }
            }

        }
    }
}
