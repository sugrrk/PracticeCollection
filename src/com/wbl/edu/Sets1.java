package com.wbl.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Sets1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Beautiful");
        hs.add("Wonderful");
        hs.add(null);
        hs.add("Marvelous");
        hs.add("Excellent");
        hs.add("Excellent");
        hs.add(null);
        hs.contains("Marvelous");

        hs.stream().forEach(System.out::println);
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
