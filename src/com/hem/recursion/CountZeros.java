package com.hem.recursion;

public class CountZeros {
    public static void main(String[] args) {
        int ans = count(3020020);
        System.out.println(ans);
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
