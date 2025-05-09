package com.hem.test;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;

        // Top half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }

            // Spaces in between
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in between
            for (int j = (n - i - 1) * 2; j > 0; j--) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
