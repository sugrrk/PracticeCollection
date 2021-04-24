package com.wbl.edu;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(200,"smith");
        ht.put(120,"John");
        ht.put(30,"Mohit");
        ht.put(450,"Shreya");
        for(Map.Entry l : ht.entrySet()){
            System.out.println("SSn is " + l.getKey() + "The name is " + l.getValue());
        }
    }
}
