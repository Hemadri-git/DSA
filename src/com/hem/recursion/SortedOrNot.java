package com.hem.recursion;

public class SortedOrNot
{
    public static void main(String[] args) {
        int[] arr = {1, 3, 53, 345, 444, 777};
        System.out.println(sorted(arr, 0));

    }
    static boolean sorted(int[] arr, int index){
       if (index == arr.length-1){
           return true;
       }

       return arr[index] < arr[index+1] && sorted(arr, index+1);
    }


}
