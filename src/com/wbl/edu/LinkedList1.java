package com.wbl.edu;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Beautiful");
        ll.add("Wonderful");
        //ll.add(null);
        ll.add("Marvelous");
        ll.add("Excellent");
        ll.add("Excellent");
        //ll.add(null);
        ll.contains("Marvelous");
        ll.get(2);
        System.out.println(ll);
        ll.stream().filter(var->var.startsWith("M")).forEach(System.out::println);
        ll.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
