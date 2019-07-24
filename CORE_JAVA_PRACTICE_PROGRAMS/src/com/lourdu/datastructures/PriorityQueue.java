package com.lourdu.datastructures;

import java.util.Arrays;

public class PriorityQueue {

    static int[] arr = null;

    int queueSize = 0;
    int front = 0, rare = 0;

    public PriorityQueue() {
        arr = new int[10];
        Arrays.fill(arr, -1);
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.priorityInsert(10);
        pq.priorityInsert(19);
        pq.priorityInsert(15);
        pq.priorityInsert(11);

        pq.printQueue();
    }

    private void priorityInsert(int element) {
        if (queueSize == 0) {
            arr[rare] = element;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (element > arr[rare]) {
                    arr[rare + 1] = arr[rare];
                }
                else {
                    break;
                }
            }

            arr[rare] = element;
            rare++;
            queueSize++;
        }

    }

    private void printQueue() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }

    }

}
