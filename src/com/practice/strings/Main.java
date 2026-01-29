package com.practice.strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//       String toggled =  toggleChar("My name is sairaj im going to crack google very soon");
//       System.out.println(toggled);
//       char[] unSorted = {'a','f','f','z','e','a','d'};
//       char[] sorted = sortCharArr(unSorted);
//       System.out.println(Arrays.toString(sorted));
        System.out.println(longestPalindromicSubstring("xbdyzzydbdyzydx"));
    }

    public static String toggleChar(String str){
        String ans = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                char nch = (char) (ch+32);
                ans += nch;
            }else if('a' <= ch && ch <= 'z'){
                char nch = (char) (ch-32);
                ans += nch;
            }

        }
        return ans;
    }

    //given a char[] in lower case sort it within same array
    //expected time complexity is o(n)
    public static char[] sortCharArr(char[] arr){
        //create freq arr of size 26 since we have only 26 alphabets
        int[] freq = new int[26];

        for(char c: arr){
            int index = c-'a';
            freq[index] += 1;
        }
        System.out.println(Arrays.toString(freq));
        int index = 0;
        for(int i = 0; i<26; i++){
            int chFreq = freq[i];
            while(chFreq>0){
                arr[index++] = (char) (i + 'a');
                chFreq--;
            }
        }

        return arr;
    }

    //giver a string. find the length of longest palindromic substring
    public static int longestPalindromicSubstring(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        //check even palindromes
        int ans = 0;
        for(int i=0; i<n-1; i++){
            int p1 = i;
            int p2 = i+1;
            ans  = Math.max(ans, expand(arr, p1, p2));
        }
        //check odd palindromes
        for(int i =1; i<n-1; i++){
            int p1 = i-1;
            int p2 = i+1;
            ans = Math.max(ans, expand(arr, p1, p2));
        }
        return ans;
    }

    public static int expand(char[] arr, int p1, int p2){
        while(p1 >= 0 && p2 < arr.length && arr[p1] == arr[p2]){
            p1--;
            p2++;
        }
        return p2-p1-1;
    }

}
