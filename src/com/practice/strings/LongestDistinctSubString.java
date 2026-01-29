package com.practice.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctSubString {
    public static void main(String[] args) {
        System.out.println(optimized("abgbhrtbc"));
    }

    public static int longestDistinctSubString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                System.out.println(s.charAt(j));
                if (set.contains(s.charAt(j))) {
                    break;
                } else {
                    set.add(s.charAt(j));
                }
            }
            System.out.println(set);
            ans = Math.max(ans, set.size());
        }
        return ans;
    }

    public static int optimized(String s) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int ans = 0;
        Set<Character> set = new HashSet<>();
        while(j<n){
            System.out.println(set);
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                System.out.println("j++: " + j);
            }else{
                set.remove(s.charAt(i));
                i++;
                System.out.println("i++: " + i);
            }
            ans = Math.max(ans, set.size());
        }

        return ans;
    }
}
