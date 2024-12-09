package com.study;

public class BubbleSort {
    static void Sort(int[] arr, int size) {

        System.out.println("Before sort");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sorting...");
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After sort");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 7, 1 };
        int size = arr.length;
        Sort(arr, size);

    }

}
