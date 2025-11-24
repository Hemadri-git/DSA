package com.hem.strings;

import java.util.Arrays;

public class AnagramCheck
{
    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";

        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr2, arr1)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not anagram");
        }

    }
}
