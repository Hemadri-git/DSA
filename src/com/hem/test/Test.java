package com.hem.test;

public class Test {
    public static void main(String[] args) {
        fn(5);
    }

    static void fn(int n) {
        if (n == 1){
            System.out.println(n);
            return;
        }
        fn(n-1);
        System.out.println(n);
    }

}