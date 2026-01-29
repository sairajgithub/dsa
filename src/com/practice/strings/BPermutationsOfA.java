package com.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class BPermutationsOfA {
    public static void main(String[] args){
        String a = "aab";
        String b = "aabbaaabavnjfkjf";
        System.out.println(findPermutations(a,b));
    }

    public static int findPermutations(String a, String b){
        Map<Character, Integer> aFreq = new HashMap<>();
        ValidAnagram.getFreqMap(a, aFreq);
        System.out.println(aFreq);
        Map<Character, Integer> tFreq;
        int ans = 0;
        tFreq = new HashMap<>();
        int s = 1;
        int e = a.length();
        int n = b.length();
        String sub = b.substring(0, e); //e exclusive
        ValidAnagram.getFreqMap(sub, tFreq);
        while(e<n){
            System.out.println("tFreq: "+tFreq);
            if(ValidAnagram.isSameFreq(aFreq, tFreq)) ans++;
            //remove start index as we are moving
            if(tFreq.get(b.charAt(s)) == 1){
                tFreq.remove(b.charAt(s));
            }else{
                tFreq.put(b.charAt(s), tFreq.get(b.charAt(s))-1);
            }
            //add ending index
            tFreq.put(b.charAt(e), tFreq.getOrDefault(b.charAt(e),0 )+1);
            s++;
            e++;
        }
        if(ValidAnagram.isSameFreq(aFreq, tFreq)) ans++;
        return ans;
    }
}
