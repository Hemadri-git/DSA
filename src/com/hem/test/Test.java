package com.hem.test;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        System.out.println(bs(arr, target, 0, arr.length - 1));

    }
    static int bs(int a[], int k, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (a[m] == k) {
            return m;
        }

        if (a[m] < k) {
            return bs(a, k, m + 1, e);
        }
        return bs(a, k, s, m - 1);

    }
}