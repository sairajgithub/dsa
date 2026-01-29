package com.practice.arrays;

import java.util.Arrays;

/*
Given an array size of N and Q queries,
find the answers to all queries in given range

Constraints
1 <= N <= 10pow5
1 <= Q <= 10pow5
 */
public class RangeSumQueries {
    public static void main(String[] args){
        int[][] q = {{1,3},{0,5},{4,6}};
        int[] a = {1,3,45,67,84,77,8,89,99};

        int[] answers = answerAllQueries(a, q);
        System.out.println(Arrays.toString(answers));
        answers = optimizedPrefixSumMethod(a,q);
        System.out.println(Arrays.toString(answers));
    }

    public static int[] optimizedPrefixSumMethod(int[] arr, int[][] q){
        int[] prefixArr = buildPrefixSum(arr);
        int[] answers = new int[q.length];
        for (int i=0; i<q.length; i++){
            int l = q[i][0];
            int r = q[i][1];
            if(l==0){
                answers[i] = prefixArr[r];
            }else {
                answers[i] = prefixArr[r] - prefixArr[l - 1];
            }
        }
        return answers;
    }


    public static int[] answerAllQueries(int[] arr, int[][] q){
        int[] answers = new int[q.length];
        for (int i=0; i<q.length; i++){
            int l = q[i][0];
            int r = q[i][1];
            int sum =0;
            for(int j=l; j<=r; j++){
                sum = sum+arr[j];
            }
            answers[i] = sum;
        }
        return answers;
    }

    public static int[] buildPrefixSum(int[] arr){
        int sum = 0;
        int[] psa = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            psa[i] = sum;
        }
        return psa;
    }
}
