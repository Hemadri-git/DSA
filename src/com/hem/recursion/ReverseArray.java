package com.hem.recursion;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        rev(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int arr[], int s, int e){
        if (s > e){
            return;
        }

        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;

        rev(arr, s+1, e-1);
    }
}
