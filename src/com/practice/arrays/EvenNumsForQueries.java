package com.practice.arrays;

import java.util.Arrays;

/*
Given an array N answer Q queries

Q is find the even numbers in the range

 */
public class EvenNumsForQueries {

    public static void main(String[] args){
        int[] arr = {3,5,8,9,16,14,13,12};
        int[][] q = {{1,5},{2,6},{4,5},{4,4},{3,6}};
        int[] pen = prefixEvenNums(arr);
        System.out.println(Arrays.toString(pen));
        int[] ans = ansQueries(pen, q);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] ansQueries(int[] arr, int[][] q){
        int n = q.length;
        int[] ans = new int[n];
        for (int i=0; i<n; i++){
            int l = q[i][0];
            int r = q[i][1];
            if(l==0){
                ans[i] = arr[r];
            }else {
                ans[i] = arr[r]-arr[l-1];
            }

        }
        return ans;
    }


    public static int[] prefixEvenNums(int[] arr){
        int n = arr.length;
        int[] pen = new int[n];
        int evenCount = 0;
        for (int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }
            pen[i] = evenCount;
        }
        return pen;
    }
}
