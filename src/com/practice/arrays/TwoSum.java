package com.practice.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Given an integer array nums[] and integer K, find if a pair such a[i] + a[j] = K and a[i] != a[j].
 */
public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,5,1,5,2,7,10,5};
        int k = 12;
        System.out.println(bruteForce(nums, k));
        System.out.println(usingHashSet(nums, k));
        System.out.println(countUsingHashMap(nums, k));
    }

    public static int countUsingHashMap(int[] nums, int k){
        int length = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int i = 0; i < length; i++){
             int x =  k - nums[i];
             count += freq.getOrDefault(x, 0);
             freq.put(nums[i], freq.getOrDefault(nums[i], 0) +1);
        }
        return count;
    }

    public static boolean usingHashSet(int[] nums, int k){
        int length = nums.length;
        Set<Integer> hash = new HashSet<>();
        for (int i = 0; i < length; i++){
            int x =  k - nums[i];
            if(hash.contains(x)) return true;
            hash.add(nums[i]);
        }
        return false;
    }

    public static boolean bruteForce(int[] nums, int k){
        int length = nums.length;
        for(int i = 0; i < length; i++){
            int x = k - nums[i];
            for (int j = i+1; j < length; j++){
                if(x == nums[j]) return true;
            }
        }
        return false;
    }
}
