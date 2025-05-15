package com.hem.math;

public class RevNum
{
    public static void main(String[] args) {
        int n = 456;
        int res = 0;
        while(n > 0){
            res = res * 10 + n % 10;
            n/=10;
        }
        System.out.println(res);
    }
}
