package com.hem.recursion;

public class ReverseNum
{
    public static void main(String[] args) {

        int ans = rev(123433);
        System.out.println(ans);
    }

    static int res = 0;
    static int rev(int n){
        if (n == 0){
            return n;
        }

        int rem = n%10;
        res = res * 10 + rem;
        rev(n/10);
        return res;
    }
}
