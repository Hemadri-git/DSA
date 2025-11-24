package com.hem.strings;

public class WordCount
{
    public static void main(String[] args) {

        String str = "java is very easy";
        String words[] = str.trim().split("\\s+");
        //System.out.println(words.length);
//        for (String word : words){
//            System.out.println(word);
//        }

        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }

    }
}
