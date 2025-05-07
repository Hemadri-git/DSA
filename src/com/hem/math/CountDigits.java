package com.hem.math;

public class CountDigits
{
    public static void main(String[] args) {
//brute force
        int n = 32565;
//        int count = 0;

//        while (n>0){
//            count++;
//            n/=10;
//        }
        int cnt = (int) (Math.log10(n) +1);

        System.out.println(cnt);

    }
}
// int cnt = (int) (Math.log10(n) + 1);---> optimal solution