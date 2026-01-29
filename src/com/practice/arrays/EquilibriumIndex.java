package com.practice.arrays;

import java.util.Arrays;

/*
Given an array find the equilibrium index i

i is equilibrium when

sum of all left of i is equal to sum of all right of i
 */
public class EquilibriumIndex {
    public static void main(String[] args){
        //int[] arr = {5,1,3,2,9};
        int[] arr = {-7,5,1,2,-4,3,0};
        int[] psa = prefixSumArr(arr);
        System.out.println(Arrays.toString(psa));

        int equilibrium = findEquilibrium(psa);
        System.out.println(equilibrium);

    }

    public static int findEquilibrium(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++) {
            if (arr[i - 1] == (arr[n-1]-arr[i])){
                return i;
            }
        }
        return -1;
    }

    public static int[] prefixSumArr(int[] arr){
        int n = arr.length;
        int[] psa = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
            psa[i] = sum;
        }
        return psa;
    }
}
