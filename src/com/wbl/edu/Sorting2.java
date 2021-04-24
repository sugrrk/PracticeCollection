package com.wbl.edu;

import java.util.*;
import java.util.ArrayList;

public class Sorting2 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(123);
        li.add(528);
        li.add(785);
        li.add(111);
        li.add(412);
        Iterator itr = li.iterator();
        System.out.println("printing the list");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Comparator cmp = Collections.reverseOrder();
        Collections.sort(li,cmp);
        System.out.println("Printing in descending order");
        Iterator itr1 = li.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


    }
}
