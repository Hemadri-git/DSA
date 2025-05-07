package com.hem.test;

public class test
{
    public static void main(String[] args) {

        int n = 288898989;
        int org = n;
        int count = 0;
        while (org>0){

            count++;
            org= org/10;
        }
        System.out.println(count);
    }
}
