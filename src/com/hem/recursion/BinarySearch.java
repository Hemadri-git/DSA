package com.hem.recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {55, 66, 78, 1, 2, 3, 4};
        Arrays.sort(arr);
        int target = 78;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {

        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]){
            return  mid;
        }
        if (target < arr[mid]){
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);

    }

}
