package com.hem.patterns;

public class _26NumericPyramid
{
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i<=n; i++){
            for (int s = n-1; s>=i; s--){
                System.out.print(" ");
            }

            for (int j = i; j>=1; j--){
                System.out.print(j);
            }

            for (int j = 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
