package com.practice.arrays;

public class MaxSubArray {
    public static void main(String[] args){
        //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-1, 0};
        System.out.println(findMaxSubArray(nums));
    }

    public static int findMaxSubArray(int[] nums)
    {
        int n =  nums.length;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        if(n ==1) return nums[0];
        for(int i=0; i<n; i++){

            curSum += nums[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum <0){
                curSum = 0;
            }
        }

        return maxSum;

    }
}
