package com.hem.arraysAsinment;

public class Merge {
    public static void main(String[] args) {

       String[] fruits1 = {"apple", "orange"};
       String[] fruits2 = {"banana", "kiwi", "mango"};
       String[] merged = new String[fruits1.length + fruits2.length];

       for (int i = 0; i<fruits1.length; i++){
           merged[i] = fruits1[i];
       }

        for (int i = 0; i < fruits2.length; i++) {
            merged[fruits1.length+i] = fruits2[i];
        }

        for( String merge : merged){
            System.out.print(merge + " ");
        }

    }
}
