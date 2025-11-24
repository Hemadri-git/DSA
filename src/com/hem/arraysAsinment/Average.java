package com.hem.arraysAsinment;

public class Average
{
    public static void main(String[] args) {
        int numbers[] = {2, 5, 3, 9, 6};
        int sum = 0;
        int average = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum+numbers[i];
        }
         average = sum/numbers.length;
        System.out.println(average);
    }
}
