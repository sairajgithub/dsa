package com.practice.search;

import java.util.*;

class AggressiveCows {

    public static boolean isPossible(int[] A, int K, int dist) {
        int i = 0;
        int cowPlaced = 1;
        for(int j = 0; j < A.length; j++) {
            if(A[j] - A[i] >= dist) {
                // we can place one cow at jth index
                cowPlaced++;
                i = j;
            }

            if(cowPlaced == K) {
                return true;
            }
        }
        return false;
    }

    // A[i] -> location of shelter,
    // K -> number of cows
    public static int aggressiveCows(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        int lo = 1;
        int hi = A[n-1] - A[0];

        int i = 0;


        int ans = 0;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(isPossible(A, K, mid)) {
                ans = mid;
                // try to Increase min distance
                lo = mid + 1;
            }
            else {
                // reduce min distance 
                hi = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] arr = {2, 6, 11, 14, 19, 25, 30, 39, 43};
        int K = 4;
        System.out.println(aggressiveCows(arr, K));
    }
}
