package com.hem.arraysAsinment;

public class MaxWithIndex
{
    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 9, 6};
        int max = nums[0];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        System.out.println("Max num is: "+max+ " found at index: "+ index);
    }
}
