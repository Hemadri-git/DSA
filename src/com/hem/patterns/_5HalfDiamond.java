package com.hem.patterns;

public class _5HalfDiamond
{
    public static void main(String[] args) {

        int n = 8;

        for (int r = 0; r<2*n; r++){
            int f = r > n ? 2 * n - r : r;
            for (int c = 0; c<f; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
