package com.wbl.edu;

import java.util.Stack;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(25);
        st.push(35);
        st.push(85);
        st.push(77);
        st.pop();
        st.push(14);
        System.out.println(st);
    }
}
