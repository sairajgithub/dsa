package com.practice.arrays;


import java.util.HashSet;

/*
Google

Given an array find if subarray sum is equal to zero
 */
public class SubArraySumZero {
    public static void main(String[] args){


    }

    public static boolean findSubArraySumZero(int[] arr){
        int[] psa = prefixSum(arr);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i<psa.length; i++){
            if(psa[i] == 0 || hashSet.contains(psa[i])) return true;
            hashSet.add(psa[i]);
        }
        return false;
    }

    public static int[] prefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        int sum = 0;
        prefixSum[0] = arr[0];
        for (int i=1; i< arr.length; i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        return prefixSum;
    }
}
