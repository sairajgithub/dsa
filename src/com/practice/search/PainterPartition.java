package com.practice.search;

import java.util.Arrays;

public class PainterPartition {
    public static void main(String[] args) {
        // int[] arr = {4, 2, 2, 3};
        int[] arr = {5, 3, 6, 1, 7};
        int k = 3;
        int t = 2;
        minTimeInPainterPartition(arr, t, k);
    }

    public static void minTimeInPainterPartition(int[] arr, int T, int K){
        arr[0] = arr[0] * T;
        int max = arr[0];
        int sum = arr[0];
        //considering max as max of all arr time per unit
        //sum is sum of all arr time per unit
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i] * T;
            max = Math.max(arr[i], max);
            sum+=arr[i];
        }
        // taking low as max because lowest time can be painted with worker for every board is max of all time per unit
        // even if all painters working on each board at time, the OVERALL time taken to complete is max
        int low = max;
        // Taking high as sum because that is sum of all boards time to be painted, if we have only one painter to do the work
        int high = sum;
        int ans = 0;
        while(low <= high){
            //checking mid of min and max to see the possibility of min time to take
            int mid = (low + high) / 2;
            // checking possibility of doing work of mid time with K workers in isPossible
            if(isPossible(arr, mid, K)){
                //if work can be done with mid time wit K workers we checking if can reduce further by 1
                high = mid - 1;
                ans = mid;
            }else {
                // if we cannot do the work with K workers for mid time then increase the time to make it possible
                low = mid+1;
            }
        }

    }

    public static boolean isPossible(int[] arr, int T, int K){
        //taking curSum as 0
        int curSum = 0;
        // taking no of workers worked till now, since we have to start with 1 worker, count = 1
        int count = 1;
        for (int i=0; i<arr.length; i++){
            //adding the time to current worker time taken
            curSum += arr[i];
           //if current worker is taking more time than he can we are adding one more worker
            // so increasing the count
            if(curSum > T){
                count++;
                // since we are adding new worker, setting current worker time to current unit time
                curSum = arr[i];
            }
            // if we are not able to complete the work with K worker we are returning false
            if(count > K){
                return false;
            }
        }
        //if we can complete the work with K workers, returning true
        return true;
    }
}
