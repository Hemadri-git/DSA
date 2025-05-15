package com.hem.strings;

public class RevString
{
    public static void main(String[] args) {
        String name = "abba";
        String rev = "";

        for (int i = name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }

    }
}
