package com.hem.recursion;

public class SumOfN
{
    public static void main(String[] args) {

        int res = sum(10);
        System.out.println(res);
    }
    static int sum(int n){
        if (n <= 1){
            return 1;
        }

        return n + sum(n-1);
    }
}
