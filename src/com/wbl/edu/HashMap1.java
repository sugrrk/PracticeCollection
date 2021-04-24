package com.wbl.edu;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(101,"Ramesh");
        hm.put(102,"Suganya");
        hm.put(103,"Mohit");
        hm.put(104,"Shreya");
        for(Map.Entry m : hm.entrySet()){
            System.out.println("Ssn is  " + m.getKey() + " Name is  "+ m.getValue());
        }

    }
}
