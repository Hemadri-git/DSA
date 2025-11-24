package com.hem.strings;

public class FindDuplicates
{
    public static void main(String[] args) {

        String str = "programming";
        String nonDup = "";
        String dup = "";

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (nonDup.indexOf(ch) == -1){
                nonDup = nonDup + ch;
            }
            else {
                dup = dup + ch;
            }
        }
        System.out.println(nonDup);
        System.out.println(dup);
    }
}
