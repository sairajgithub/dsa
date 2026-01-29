package com.practice.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class ValidAnagram {
    public boolean anagramStrings(String s, String t) {
        if(s.length() ==1 && t.length() ==1){
            return s.equals(t);
        }

        if(s.length() != t.length()) return false;

        Map<Character, Integer> sFreq = new HashMap<>();
        Map<Character, Integer> tFreq = new HashMap<>();

        getFreqMap(s, sFreq);

        getFreqMap(t, tFreq);

        if(sFreq.size()!=tFreq.size()) return false;

        if (isSameFreq(sFreq, tFreq)) return false;
        return true;
    }

    public static boolean isSameFreq(Map<Character, Integer> sFreq,
                                     Map<Character, Integer> tFreq) {

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');

            int sCount = sFreq.getOrDefault(c, 0);
            int tCount = tFreq.getOrDefault(c, 0);

            if (sCount != tCount) {
                return false;
            }
        }
        return true;
    }


    public static void getFreqMap(String s, Map<Character, Integer> sFreq) {
        for(Character c: s.toCharArray()){
          sFreq.put(c, sFreq.getOrDefault(c, 0)+1);
        }
    }
}