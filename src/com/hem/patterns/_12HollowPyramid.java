package com.hem.patterns;

public class _12HollowPyramid
{
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i<=n; i++){
            for (int s = i; s<n; s++){
                System.out.print(" ");
            }

            for (int k = 1; k<=2*i-1; k++){
                if (k==1 || k == 2*i-1|| i == n){
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
