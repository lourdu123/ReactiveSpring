package com.lourud.arrays;

public class InsertAnElementIntoArrayWithoutUsingTempVariable {

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;
        System.out.println("length::" + arr.length);

        // insertElement(arr, 4);

        insertElementAtSpecificIndex(arr, 3, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void insertElementAtSpecificIndex(int[] arr, int indexAtWhichElementToBeInserted, int element) {

        for (int i = arr.length - 1; i >= indexAtWhichElementToBeInserted; i--) {
            if (i == indexAtWhichElementToBeInserted) {
                arr[i] = element;
            }
            else {
                arr[i] = arr[i - 1];
            }
        }
    }

    /*private static void insertElement(int[] arr, int element) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element < arr[i]) {
                index = i;
                break;
            }
        }
        for (int j = arr.length - 1; j > 0; j--) {

            if (j > index) {
                arr[j] = arr[j - 1];
            }
            else {
                arr[j] = element;
                break;
            }

        }
    }*/

}
