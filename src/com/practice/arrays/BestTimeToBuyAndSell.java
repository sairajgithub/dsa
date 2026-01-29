package com.practice.arrays;
/*
Given an array arr of n integers, where arr[i] represents price of the stock on the ith day.
Determine the maximum profit achievable by buying and selling the stock at most once.

The stock should be purchased before selling it, and both actions cannot occur on the same day.
 */
public class BestTimeToBuyAndSell {
    public static void main(String[] args){
     int[] arr = {7,1,5,3,6,4};
        System.out.println(bruteForce(arr));
    }

    public static int bruteForce(int[] arr){
        int maxProfit = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                if(maxProfit < arr[j]-arr[i]){
                    maxProfit = arr[j]-arr[i];
                }
            }
        }
        return maxProfit;
    }

    public static int makeTrade(int[] arr){
        int n = arr.length;
        int maxProfit = 0;
        int bestBuyPrice = Integer.MAX_VALUE;
        for (int currentPrice : arr) {
            bestBuyPrice = Math.min(bestBuyPrice, currentPrice);
            maxProfit = Math.max(maxProfit, currentPrice - bestBuyPrice);
        }
        return maxProfit;
    }

}
