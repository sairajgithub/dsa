package com.practice.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);

        //remove and return LIFO
        System.out.println(st.pop());
        //just read not remove
        System.out.println(st.peek());

        System.out.println(st.size());
    }
}
