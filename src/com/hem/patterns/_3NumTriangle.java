package com.hem.patterns;

public class _3NumTriangle
{
    public static void main(String[] args) {
        int n = 5;

        for (int r = 1; r<=n; r++){
            for (int c = 1; c<=r; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
