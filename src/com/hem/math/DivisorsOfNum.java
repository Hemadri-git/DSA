package com.hem.math;

public class DivisorsOfNum
{
    public static void main(String[] args) {

        int n = 345;

        int[] divisors = new int[n];
        int count = 0;

        for (int i = 1; i<=n; i++){
            if (n%i == 0){
                divisors[count++] = i;
            }
        }


        for (int i : divisors){
            if (count>0)
            System.out.print(i+" ");
            count--;



        }
    }
}
