package com.practice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//create prefix sum array
public class PrefixSum {
    public static void main(String[] args){
        int[] arr = {5,6,7,7,7,8};
        int[] pArr = makePrefixSumArr(arr);
        System.out.println(Arrays.toString(pArr));
    }

    public static int[] makePrefixSumArr(int[] arr){
        int[] pArr = new int[arr.length];
        pArr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pArr[i] = arr[i]+pArr[i-1];
        }
        return pArr;
    }


}
