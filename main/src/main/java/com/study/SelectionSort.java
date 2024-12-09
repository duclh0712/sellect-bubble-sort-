package com.study;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,7,1,8,9}; 
        int size = arr.length;
        
        System.out.println("Before sort");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sorting...");
        for (int i = 0; i < size-1; i++) {
            // init min index
            int min_index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_index]) {
                    // update min index
                    min_index = j;
                }
            }
            // move correct pos
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        
        System.out.println("After sort");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        
    }

   
}
