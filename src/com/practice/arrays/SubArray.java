package com.practice.arrays;
/*
print all subarrays of an array
 */

public class SubArray {
    public static void main(String[] args){
        int[] arr = {3, -1, 4};
        printSubArrays(arr);
        printSumSubArrays(arr);
        int[] psa = makePrefixSumArray(arr);
        printSumSubArraysOptimized(psa);
        printSumSubArraysOptimized_1(arr);
        printSumOfAllSubArrays(arr);
        printSumSubArraysOptimized_2(arr);
    }

    public static void printSumSubArraysOptimized_2(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i]*(n-i)*(i+1);
        }
        System.out.println(sum);
    }
    public static void printSumOfAllSubArrays(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int s=0; s<n; s++){
            int sum = 0;
            for (int e=s; e<n; e++){
                System.out.println("subarray element:"+arr[e]);
                sum += arr[e];
                System.out.println("subarray sum:"+sum);
                ans += sum;
                System.out.println("outside subarray ans:"+ans);
            }
//            ans += sum;
        }
        System.out.println("sum of all sub arrays sum:"+ ans);
    }

    public static void printSumSubArraysOptimized_1(int[] arr){
        int n = arr.length;
        for (int s=0; s<n; s++){
            int sum = 0;
            for (int e=s; e<n; e++){
                sum += arr[e];
                System.out.println(sum);
            }
        }
    }

    // tc o2 sc o(n)
    public static void printSumSubArraysOptimized(int[] psa){
        int n = psa.length;
        for(int s=0; s<n; s++){
            int sum = 0;
            for (int e=s; e<n; e++){
                if(s == 0){
                    System.out.println(psa[e]);
                }else {
                    System.out.println(psa[e]-psa[s-1]);
                }
            }
        }
    }

    public static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] psa = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
            psa[i] = sum;
        }
        return psa;
    }

    public static void printSumSubArrays(int[] arr){
        int n = arr.length;
        for (int s=0; s<n; s++){
            for (int e=s; e<n; e++){
                int sum =0;
                for (int k=s; k<=e; k++){
                    sum += arr[k];
                }
                System.out.println("sum: "+sum);
            }
        }
    }

    public static void printSubArrays(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}
