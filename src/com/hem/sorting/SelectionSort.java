package com.hem.sorting;

public class SelectionSort
{
    public static void main(String[] args) {

        int arr[] = {23, 43, 2, 34, 53, 1};

        for (int i = 0; i<arr.length-1; i++){
            int minIndex = i;

            for (int j = i+1; j< arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Selection Sort order: ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
