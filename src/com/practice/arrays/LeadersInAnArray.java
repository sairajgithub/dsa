package com.practice.arrays;

import java.util.Arrays;

//find the leaders an integer array
//arr[i] considered to be a leader when it's greater than all elements in its left
//arr[0] is always considered as leader since there are no elements to the left
public class LeadersInAnArray {
    public static void main(String[] args){
        int[] arr= {7,2,9,8,5,11,3,5,6,55};
        Arrays.sort(arr);
        int result = LeadersInAnArray.countLeaders(arr);
        System.out.println(result);
    }

    public static int countLeaders(int[] arr){
        int leaders = 1;
        int lastLargest = arr[0];
        for(int i: arr){
            if(i > lastLargest){
                lastLargest = i;
                leaders++;
            }
        }
        return  leaders;
    }
}
