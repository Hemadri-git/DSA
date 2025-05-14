package com.hem.test;

public class Test {
    public static void main(String[] args) {

        int[] arr  = {423, 12, 43, 4, 3, 45,2};


        for (int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] >key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}