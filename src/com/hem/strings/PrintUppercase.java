package com.hem.strings;

public class PrintUppercase
{
    public static void main(String[] args) {

        String s = "HeMaDrI BatHuLA";

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (ch >='A' && ch <='Z'){
                System.out.print(ch);
            }
        }


    }
}
