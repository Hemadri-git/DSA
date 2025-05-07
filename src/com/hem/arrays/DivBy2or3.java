package com.hem.arrays;

public class DivBy2or3
{
    public static void main(String[] args) {
        int a[] = {15, 32, 22, 4, 23, 5, 34, 54, 36, 27, 9};

        int count = 0;
        for (int i = 0; i<a.length; i++){
            if (a[i] %2 == 0 && a[i] % 3 == 0){
                count++;
                System.out.println(a[i]);
            }

        }
        System.out.println(count);

    }
}
