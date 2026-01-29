package com.practice.bitwise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(13&10);
    }

    //given an array find the sum of every subsequence
    public static int subSeqMax(int[] arr){
        int sum = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            //every element in array contributing 2 pow n time in a subset, subset and subsequence are same when
            // it comes to calculating sum
            sum += arr[i] * (1 << i); //contribution technique

        }
        return sum;
    }


    //given an integer array and integer K find the if any subset that sums up to K
    public static boolean sumK(int[] nums, int k){
        int n = nums.length;
        int totalSubSet = 1 << n;
        for(int i=0; i<totalSubSet; i++){
            int sum = 0;
            for(int bit = 0; bit < n; bit++){
                if(checkBit(i, bit)){
                    sum += nums[bit];
                }
            }
            if(sum == k){
                return true;
            }
        }
        return false;
    }

    public static int totalSetBits(int n){
        int count = 0;
        while (n>0){
            int rem = n % 2;
            n = n/2;
            if(rem == 1){
                count ++;
            }
        }
        return count;
    }

    public static boolean checkBit(int n, int i){
        return (n & (1 << i)) != 0;
    }

    public static int flipBit(int n, int i){
        return n ^ (1<<i);
    }

    public static int unsetIthIndex(int n, int i){
        return n & i << i;
    }
}
