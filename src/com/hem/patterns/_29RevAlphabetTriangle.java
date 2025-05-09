package com.hem.patterns;

public class _29RevAlphabetTriangle
{
    public static void main(String[] args) {

        char start = 'H';

        for (char i = start; i>='A'; i--){
            for (char j = i; j>='A'; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
