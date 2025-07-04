package com.hem.sorting;

import java.util.Arrays;

public class RecursiveBubbleSort
{
    public static void main(String[] args) {
        int[] arr = {3,2,1,5, 4, 78, 868, 11};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int r, int c) {
        if (r==0){
            return;
        }

        if (c<r){

            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r, c+1);
        }
        else {
            bubble(arr, r-1, 0);
        }
    }
}
