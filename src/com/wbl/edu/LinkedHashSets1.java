package com.wbl.edu;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets1 {
    public static void main(String[] args) {
        Set<String> ls = new LinkedHashSet<String>();
        ls.add("aaa");
        ls.add("abc");
        ls.add("ggg");
        ls.add("ddd");
        ls.add("ttt");
        ls.add("ade");
        ls.add("asa");
//        Iterator itr =  ls.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        //ls.stream().sorted().forEach(System.out::println);
        //ls.stream().filter(var->var.startsWith("g")).forEach(System.out::println);
        //ls.stream().sorted().forEach(System.out::println);
        ls.stream().filter(var->var.startsWith("a")).forEach(System.out::println);
    }
}
