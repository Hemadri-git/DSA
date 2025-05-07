package com.hem.arrays;

public class Count1s {
    public static void main(String[] args) {
        int[] arr = {432,1,3,23,1,3,4,1,4,3,1,431,1,3421,1, 312,3 ,1, 42,431,1,1,1,1};
        int count = 0;
      int i = 0;
      do {
          if (arr[i] == 1)
              count++;
          i++;
      }while (i< arr.length);
        System.out.println(count);
    }
}
