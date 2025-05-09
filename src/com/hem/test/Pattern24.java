package com.hem.test;
public class Pattern24 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i<=n; i++){
            for (int s = 0; s<n-i; s++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1; i>=1; i--){
            for (int s =0; s<n-i; s++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
