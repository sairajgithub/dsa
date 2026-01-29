package com.practice.sort;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums=  {2, 3, 7, 1, 3, 5};
        long count = solution.numberOfInversions(nums);


    }
    static long count = 0;
    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        int[] sorted  = mergeSort(nums, 0, n-1);
        System.out.println(Arrays.toString(sorted));
        return count;
    }

    int[] mergeSort(int[] nums, int start, int end){
        if(start == end){
            return new int[]{nums[start]};
        }
        int mid = (start + end)/2;
        int[] left = mergeSort(nums, start, mid);
        int[] right = mergeSort(nums, mid+1, end);
        return merge(left, right);
    }

    int[] merge(int[] left, int[] right){
        int n = left.length;
        int m = right.length;
        int i = 0, j = 0, k = 0;
        int[] temp = new int[n+m];
        while(i<n && j<m){
            if(left[i] <= right[j]){
                temp[k] = left[i];
                i++;
            }else{
                count = count+n-i+1;
                System.out.println(count);
                temp[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<n){
            temp[k] = left[i];
            i++;
            k++;
        }

        while(j<m){
            temp[k] = right[j];
            j++;
            k++;
        }
        return temp;
    }

}