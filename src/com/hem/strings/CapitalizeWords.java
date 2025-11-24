package com.hem.strings;

import java.util.Arrays;

public class CapitalizeWords
{
    public static void main(String[] args) {

        String str = "java is a programing language";
        String[] words = str.split(" ");

        String result = "";

        for (String w : words){
            String first = w.substring(0,1).toUpperCase();
            String rest = w.substring(1).toLowerCase();

            result = result+first+rest+" ";
        }
        System.out.println(result.trim());
    }
}
