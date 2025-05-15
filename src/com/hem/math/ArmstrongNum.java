package com.hem.math;

public class ArmstrongNum
{
    public static void main(String[] args) {

        int n =  1741725;
        int cnt = (int)(Math.log10(n) + 1);
        int temp = n;
        int res = 0;
        int rem = 0;

        while (temp > 0) {
            rem = temp % 10;
            res = (int) (res + Math.pow(rem, cnt));
            temp /= 10;
        }

        if (n == res){
            System.out.println("ArmStrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
