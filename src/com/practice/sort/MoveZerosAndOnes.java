package com.practice.sort;

import java.util.Arrays;

public class MoveZerosAndOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,0,0,0};
        solve(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void solve(int[] nums){
        int i = 0, j = 0;
        int n = nums.length;
        while (j<n){
            if(nums[j] == 1){
                j++;
            }else if(nums[j] == 0){
                int left = nums[i];
                nums[i] = nums[j];
                nums[j] = left;
                i++; j++;
            }
        }
    }
}
