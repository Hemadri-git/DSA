package com.hem.patterns;

public class _10RevPyramid
{
    public static void main(String[] args) {

        int n = 5;

        for (int r = n; r>=1; r--){
            for (int s = 1 ; s<=n-r; s++){
                System.out.print(" ");
            }

            for (int c = 1; c<=2*r-1; c++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
