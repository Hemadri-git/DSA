package com.hem.patterns;

public class _22BinaryTriangle
{
    public static void main(String[] args) {

        int n = 7;

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
//               if ((i+j)%2 == 0){
//                   System.out.print("1 ");
//               }
//               else {
//                   System.out.print("0 ");
//               }
                System.out.print((i+j+1)%2 + " ");
            }
            System.out.println();

        }

    }
}
