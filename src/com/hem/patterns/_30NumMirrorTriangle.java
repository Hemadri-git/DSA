package com.hem.patterns;

public class _30NumMirrorTriangle
{
    public static void main(String[] args) {

        int  n = 4;

        for (int i = 1; i <=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }

            for (int s = 1; s<=2 * (n-i);s++) {
                System.out.print(" ");
            }

            for (int k = i; k>=1; k--){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
