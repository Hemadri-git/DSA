package com.hem.patterns;

public class _25RevTriangle_1toN
{
    public static void main(String[] args) {

        int n = 4;  // number of rows
        int num = 1;
        int totalNums = n * (n + 1) / 2; // 10
        int rightStart = 2 * totalNums;  // 20

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int s = 0; s < 2 * i; s++){
                System.out.print(" ");
            }

            int leftCount = n - i;
            int rightCount = leftCount;

            // Print left side numbers
            for (int j = 0; j < leftCount; j++) {
                System.out.print(num++ + " ");
            }

            // Calculate starting point for right side
            int temp = rightStart - rightCount + 1;

            // Print right side numbers
            for (int j = 0; j < rightCount; j++) {
                System.out.print(temp++ + " ");
            }

            rightStart -= rightCount;

            System.out.println();
        }
    }
}
