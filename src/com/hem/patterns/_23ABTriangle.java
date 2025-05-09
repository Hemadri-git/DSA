package com.hem.patterns;

public class _23ABTriangle
{
    public static void main(String[] args) {

        int n =5;

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                char ch = ((i+j+1)%2)!=0? 'A' : 'B';
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
}
