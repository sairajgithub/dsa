package com.practice.arrays;

import java.util.HashMap;
import java.util.HashSet;

/*
* Distinct elements in subarray k
* */
public class DistinctElementsSubArrayK {
    public static void main(String[] args) {
        int[] arr = {2,4,3,8,3,9,4,9};
        int k = 4;
        System.out.println(solveUsingHashMap(arr, k));
        int [][] coordinates = {{1,2},{2,1},{1,2},{3,4},{5,6}};
        System.out.println(distinctCoordinates(coordinates));
    }


    //Distinct coordinate in 2D plane
    public static int distinctCoordinates(int[][] coordinates){
        int size = coordinates.length;
        HashSet<String> distinct = new HashSet<>();
        for (int i=0; i<size; i++){
                String crd = coordinates[i][0] + "#" + coordinates[i][1];
                distinct.add(crd);
        }
        return distinct.size();
    }


    public static int solveUsingHashMap(int[] arr, int k){
        HashMap<Integer,Integer> freq = new HashMap<>();
        int count = 0;

        // initialize first window
        for (int i = 0; i < k; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }

        count += freq.size();

        int start = 1;
        int end = k;   // end points to the next element after window

        while (end < arr.length){
            freq.put(arr[end], freq.getOrDefault(arr[end],0)+1);
            // remove outgoing
            int out = arr[start-1];
            freq.put(out, freq.getOrDefault(out, 0)-1);
            if(freq.getOrDefault(out, 0) == 0){
                freq.remove(out);
            }
            count += freq.size();
            start++;
            end++;
        }

        return count;
    }
}
