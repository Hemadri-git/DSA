package com.hem.patterns;

public class _6Diamond
{
    public static void main(String[] args) {

        int n = 5;

        for (int r = 0; r<2*n; r++){
            int f = r > n? 2 * n - r : r;

            int space = n - f;

            for (int s = 0; s<space; s++){
                System.out.print(" ");
            }

            for (int c = 0; c<f; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
}
