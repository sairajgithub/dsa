package com.practice.sort;

import java.util.Arrays;

/* sort array such that all elements less than pivot (last element) on left
 and all elements greater than pivot are right to the pivot
 */
public class PivotBasedSort {
    public static void main(String[] args) {
        int[] nums = {1,11,2,34,3,5656,4,3434,453,34,45};
        solve(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void solve(int[] nums){
        int i = 0, j = 0;
        int n = nums.length;
        int pivot = nums[n-1];
        while (j<n-1){
            if (nums[j] >= pivot) {
                j++;
            }else if(nums[j] < pivot){
                int left = nums[i];
                nums[i] = nums[j];
                nums[j] = left;
                i++;
                j++;
            }
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
