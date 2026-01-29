package com.practice.arrays;

public class MaxSubArrayLengthK {

    public static void main(String[] args) {
        int[] nums = {2,9,4,-1,3,8};
        int k = 3;
        long max = maximumSubarraySum(nums, k);
        System.out.println(max);
    }

        public static long maximumSubarraySum(int[] nums, int k) {
            int s = 0;
            int e = k-1;
            int n = nums.length;
            int[] psa = new int[n];
            psa[0] = nums[0];
            for(int i=1; i<n; i++){
                psa[i] = nums[i] + psa[i-1];
            }
            int maxSum = Integer.MIN_VALUE;
            int sum = 0;
            while(e<n){
                if(s==0){
                    sum = psa[e];
                }else{
                    sum = psa[e] - psa[s-1];
                }
                maxSum = Math.max(maxSum, sum);
                s++;
                e++;
            }

            return maxSum;
        }

}
