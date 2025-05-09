package com.hem.patterns;

public class _19MirroredTriangle
{
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i<n; i++){
            for (int j = 0;j<=i; j++){
                System.out.print("*");
            }
            for (int s = 1; s<=2*(n-i-1) ; s++){
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i<n; i++){
            for (int j = i; j < n; j++){
                System.out.print("*");
            }
            for (int s = 1; s<= 2*i; s++){
                System.out.print(" ");
            }
            for (int k = i; k<n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
