package com.hem.arraysAsinment;

import java.util.Arrays;

public class RevBooleanArr
{
    public static void main(String[] args) {

        boolean[] bool = {true, false, false, true, false, true};

        for (int i = 0; i<bool.length/2; i++){
            boolean temp = bool[i];
            bool[i] = bool[bool.length-1-i];
            bool[bool.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(bool));
    }
}
