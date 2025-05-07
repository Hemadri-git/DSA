package com.hem.math;

public class PrimeOrNot
{
    public static void main(String[] args) {

        int n = 97;
        int cnt = 0;

        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                cnt++;

                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }

        if (cnt == 2){
            System.out.println(" prime");
        }
        else {
            System.out.println("not-prime");
        }

    }
}
