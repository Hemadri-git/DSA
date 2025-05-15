package com.hem.arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;

        int kthSmallest = findKthSmallest(arr, k);
        System.out.println(k + "rd smallest element is: " + kthSmallest);
    }


    public static int findKthSmallest(int[] arr, int k) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr[k - 1];
    }
}

