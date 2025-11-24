package com.hem.strings;

public class ReverseUsingStringBuilder
{
    public static void main(String[] args) {

        String str = "hemadri";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());

        //one line
        System.out.println(new StringBuilder("bathula").reverse());
    }
}
