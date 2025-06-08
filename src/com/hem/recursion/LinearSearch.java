package com.hem.recursion;

import java.util.ArrayList;

public class LinearSearch
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 6, 8, 9};
        int target = 5;
        System.out.println(searchList(arr, target, 0));

    }

    static int search(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }
        return search(arr, target, index+1);
    }

    static boolean searchBoolean(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        if (arr[index] == target){
            return true;
        }
        return searchBoolean(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> searchList(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
             list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls  = searchList(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;



    }

}
