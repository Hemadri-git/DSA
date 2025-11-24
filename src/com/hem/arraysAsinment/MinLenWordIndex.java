package com.hem.arraysAsinment;

public class MinLenWordIndex
{
    public static void main(String[] args) {

        String[] words = {"coffee", "water" , "chai", "diet cake"};
        String smallWord = words[0];
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < smallWord.length()){
                smallWord = words[i];
                index = i;
            }
        }

        System.out.println(smallWord);
        System.out.println(index);

    }
}
