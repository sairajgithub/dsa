package com.practice.recursion;

public class Palindrome {
    public static void main(String[] args) {
        char[] chars = "abbac".toCharArray();
        System.out.println(palindrome(chars, 0, 2));

    }
    public static boolean palindrome(char[] chars,int s, int e){
        if(s==e||s>e){
            return true;
        }
        if(chars[s] != chars[e]){
            return false;
        }
        return palindrome(chars, s+1, e-1);
    }
}

