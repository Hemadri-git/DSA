package com.hem.math;

public class PalindromeNumber
{
    public static void main(String[] args) {

        int num = 3443, rev = 0, rem;
        int orgNum = num;

        while (num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }

        if (orgNum == rev){
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
