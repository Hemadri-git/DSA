package com.hem.methods;

public class Demo
{
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isPrime(int n){
        if (n<=1)
            return false;

        for (int i = 2; i<=n/2; i++)
            if (n%i == 0)
                return false;

        return true;
    }

    static void fibonacci(int n){
        int a = 0, b = 1;
        for (int i = 1; i<=n; i++){
            System.out.print(a+ " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPrime(77));
    }
}
