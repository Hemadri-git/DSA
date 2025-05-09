package com.hem.patterns;

public class _24InvertedNumTriangle
{
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i<=5; i++){
            for (int j = n; j>=i; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
