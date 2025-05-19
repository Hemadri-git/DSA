package com.hem.recursion;
//leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class steps
{
    public static void main(String[] args) {

        int ans = numberOfSteps(8);
        System.out.println(ans);
    }

    static int numberOfSteps(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int steps) {
        if (n == 0){
            return steps;
        }

        if (n%2 == 0){
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}
