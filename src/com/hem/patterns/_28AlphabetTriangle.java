package com.hem.patterns;

public class _28AlphabetTriangle
{
    public static void main(String[] args) {
        char s = 'E';

        for (char i = s; i>='A'; i--){
            for(char j = i; j<=s; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
