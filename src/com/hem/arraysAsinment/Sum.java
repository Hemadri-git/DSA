package com.hem.arraysAsinment;

public class Sum
{
    public static void main(String[] args) {

        int[] numbers = {2, 5, 1, 9, 6};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println(sum);
    }
}
