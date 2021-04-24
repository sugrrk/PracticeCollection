package com.wbl.edu;

import java.util.*;

public class ArrayList<I extends Number> {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> al = new java.util.ArrayList<>();
        al.add(101);
        al.add(102);
        al.add(103);
        al.add(104);
        al.add(104);
        al.add(101);
        al.add(null);
        al.add(null);

        al.add(105);
        System.out.println(al);


    }
}



