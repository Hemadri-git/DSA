package com.hem.test;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.print("Prime numbers between 1 and " + N + ": ");
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
