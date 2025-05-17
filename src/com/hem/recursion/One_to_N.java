package com.hem.recursion;

public class One_to_N
{
    public static void main(String[] args) {
       print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}
