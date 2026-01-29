package com.practice.strings;

import java.util.List;
import java.util.ArrayList;
public class KMP {
    public static void main(String[] args){
        String s = "aabaabc";
        System.out.println(LPS(s));
    }

    //longest prefix suffix
    public static String LPS(String s){
        //build prefixes
        List<String> prefixes = new ArrayList<>();
        List<String> suffixes = new ArrayList<>();

        StringBuilder psb = new StringBuilder();
        for(int i=0; i<s.length()-1; i++){
            psb.append(s.charAt(i));
            prefixes.add(psb.toString());
        }
        System.out.println(prefixes);

        for (int i = s.length() - 1; i >= 1; i--) {
            suffixes.add(s.substring(i));
        }

        System.out.println(suffixes);

        int n = prefixes.size();
        String ans = "";
        for(int i=0; i<n; i++){
            String prefix = prefixes.get(i);
            String suffix = suffixes.get(i);
            if(prefix.equals(suffix)){
                ans = prefix;
            }
        }

        return ans;
    }
}