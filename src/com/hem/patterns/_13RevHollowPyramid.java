package com.hem.patterns;

public class _13RevHollowPyramid
{
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i>=0; i--){
            for (int s = 1; s <= n-i; s++){
                System.out.print(" ");
            }
            for (int k = 1; k<=2*i-1; k++){
                if (i==n || k == 1 || k == 2*i-1){
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
