package com.hem.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(32);
        pq.offer(12);
        pq.offer(5);
        pq.offer(48);
        pq.offer(467);
        pq.offer(54);
        pq.offer(546);





        System.out.println(pq);


    }
}
