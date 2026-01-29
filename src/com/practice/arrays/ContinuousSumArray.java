package com.practice.arrays;


import java.util.Arrays;

/*
Asked in google

Given in an arr[] with all element = 0 and q queries. for every query {start, end}
do val+ in the range from start to end. Return the final answer.
 */
public class ContinuousSumArray {
    public static void main(String[] args){
        int[][] q = {{3,6,1},{2,7,3},{4,6,5},{1,5,-4}};
        int[] a = new int[10];
        int[] answer = continuousSumArray(a, q);
        System.out.println(Arrays.toString(answer));
        a = new int[10];
        answer = solveUsingPrefix(a, q);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] continuousSumArray(int[] a, int[][]q){
        for (int i=0;i<q.length;i++)
        {
            int s = q[i][0];
            int e = q[i][1];
            int v = q[i][2];

            for (int j=s; j<=e; j++){
                a[j] += v;
            }
        }
        return a;
    }

    public static int[] solveUsingPrefix(int[]a , int[][]q){
        for (int i=0; i<q.length; i++){
            int s = q[i][0];
            int e = q[i][1];
            int v = q[i][2];

            a[s] = +v;
            if(e+1 < a.length-1){
                a[e+1] -= v;
            }
        }
        for (int j=1; j< a.length; j++){
            a[j] = a[j] + a[j-1];
        }
        return a;
    }




}
