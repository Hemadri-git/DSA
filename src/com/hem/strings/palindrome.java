package com.hem.strings;

public class palindrome
{
    public static void main(String[] args) {

        String name = "abba";
        boolean palindrome = false;
        int n = name.length();
        int mid = n/2;

        for (int i = 0; i<mid; i++){
            if (name.charAt(i) == name.charAt(n-i-1)){
                palindrome = true;
                break;
            }
        }

        if (palindrome){
            System.out.println("palindrome ");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
