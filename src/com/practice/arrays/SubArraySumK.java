package com.practice.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Given an array nums[] and target k, find if any subarray sum equals to target K
 */
public class SubArraySumK {
    public static void main(String[] args){
        int[] nums = {3,11,-4,1,-2,5,6,2};
        int k = 6;
        System.out.println(findSubArrayWithK(nums, k));
        System.out.println(countSubArrayWithK(nums, k));
    }

    public static int countSubArrayWithK(int[] nums, int k){
        int psum = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            psum += nums[i];
            int x = psum - k;
            count += freq.getOrDefault(x, 0);
            freq.put(psum, freq.getOrDefault(psum ,0) +1);
        }
        return count;
    }


    public static boolean findSubArrayWithK(int[] nums, int k){
        int psum = 0;
        Set<Integer> hash = new HashSet<>();
        hash.add(0);
        for (int i=0; i<nums.length; i++){
            psum += nums[i];
            int x = psum - k;
            if(hash.contains(x)) return true;
            hash.add(psum);
        }
        return false;
    }

}
