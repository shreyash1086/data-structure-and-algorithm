package com.Bubble_sort;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9,45,56};
        for (int i = arr.length-1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                int didSwap = 0;
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    didSwap=1;
                }
                if(didSwap == 0){
                    break; // this statement is used to break the outer loop inner loop already indicated that the array is sorted
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
