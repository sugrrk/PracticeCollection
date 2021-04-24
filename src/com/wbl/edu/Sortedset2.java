package com.wbl.edu;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset2 {
    public static void main(String[] args) {
        Set<String> ss = new TreeSet<>();
        ss.add("v");
        ss.add("b");
        ss.add("z");
        ss.add("a");
        ss.add("p");
        ss.remove("p");
        System.out.println(ss);
    }
}
