package com.wbl.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class reverse2 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(123);
        li.add(528);
        li.add(785);
        li.add(111);
        li.add(412);
        Iterator itr = li.iterator();
        System.out.println("Printing the list");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator itr1 = li.iterator();
        Collections.reverse(li);
        System.out.println("After reversing");
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
