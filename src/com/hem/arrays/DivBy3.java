package com.hem.arrays;

public class DivBy3
{
    public static void main(String[] args) {

        int a[] = {23, 43,2, 2,132, 43, 6, 7, 9};
        int count = 0;
        for (int i = 0; i<a.length; i++){
            if (a[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
