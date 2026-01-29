package com.practice.stack;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args){
        String s = "abccdq";
        System.out.println(solve(s));

    }

    public static String solve(String s){
        char[] chars = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c : chars){
            if(!st.empty() && st.peek() == c) {
                    st.pop();
                    continue;
            }
            st.push(c);
        }
        StringBuilder sb  = new StringBuilder();
        for(char c: st){
            sb.append(c);
        }
        return sb.toString();
    }


}
