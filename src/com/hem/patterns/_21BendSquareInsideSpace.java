package com.hem.patterns;

public class _21BendSquareInsideSpace
{
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i<=n; i++){
            for (int s = 1; s<=n-i; s++){
                System.out.print(" ");
            }
            for (int k = 1; k<=n; k++){
                if (i == 1 || i == n || k == 1|| k == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
