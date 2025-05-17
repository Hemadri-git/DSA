package com.hem.recursion;

public class prodOfDigits
{
    public static void main(String[] args) {
        int ans = sum(564);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n%10 == n){
            return n;
        }
        return n%10 * sum(n/10);
    }
}
