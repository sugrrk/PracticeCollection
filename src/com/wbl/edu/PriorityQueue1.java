package com.wbl.edu;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Suganya");
        pq.add("Ramesh");
        pq.add("Mohit");
        pq.add("Shreya");
//        System.out.println(pq);
//        System.out.println(pq.element());
//        System.out.println("head " + pq.peek());
       pq.remove("Mohit");
//        System.out.println("head " + pq.peek());
        System.out.println((pq.poll()));

    }
}
