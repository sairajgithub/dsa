package com.practice.arrays;


//Given n non-negative integers representing an elevation map where the width of each bar is 1,
//compute how much water it can trap after raining.

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args){
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] leftMax = calculateLeftMax(nums);
        System.out.println(Arrays.toString(leftMax));
        int[] rightMax = calculateRightMax(nums);
        System.out.println(Arrays.toString(rightMax));
        System.out.println(calculateTrappedWater(nums));
    }

    public static int calculateTrappedWater(int[] nums){
        int n = nums.length;
        int[] leftMax = calculateLeftMax(nums);
        int[] rightMax = calculateRightMax(nums);
        int waterTrapped = 0;
        for (int i=0; i<n; i++){
            waterTrapped += Math.min(leftMax[i], rightMax[i])-nums[i];
        }
        return waterTrapped;
    }

    public static int[] calculateLeftMax(int[] nums){
        int n = nums.length;
        int[] leftMax = new int[n];
        leftMax[0] = nums[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(nums[i],leftMax[i-1]);
        }
        return leftMax;
    }

    public static int[] calculateRightMax(int[] nums){
        int n = nums.length;
        int[] rightMax = new int[n];
        rightMax[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            System.out.println(i);
            rightMax[i] = Math.max(nums[i], rightMax[i+1]);
        }
        return rightMax;
    }

}
