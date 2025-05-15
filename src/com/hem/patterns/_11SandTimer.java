package com.hem.patterns;

public class _11SandTimer
{
    public static void main(String[] args) {
        int n = 5;

        for (int r = n; r>=1; r--){
            for (int s = 1; s<=n-r; s++){
                System.out.print(" ");
            }

            for (int c = 1; c<=r; c++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i<=n; i++){
            for (int s = 1; s<=n-i; s++){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
