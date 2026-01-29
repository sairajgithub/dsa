package com.practice.twopointer;

public class Main {
    public static void main(String[] args){
//        int[] a = {2,5,8,9};
//        pairSum(a);
//        pairDifference(a);
        int[] ht = {3,6,4,5,2};
        containerWater(ht);
    }
    //given a sorted array, check if there exists a pair(i, j)
    //such that A[i] + A[j] == k, and i != j
    public static void pairSum(int[] a){
        int i = 0;
        int j = a.length-1;
        int k = 9;
        boolean ans = false;
        while(i < j){
            int sum = a[i] + a[j];
            if(sum == k){
                ans = true;
                break;
            }else if(sum < k){
                i++;
            }else{
                j--;
            }
        }
        System.out.printf("Ans: %b %n", ans);
    }

    //Given a sorted array, check if there exists a pair (i,j)
    //such that A[j] - A[i] == k, k>0, and i !=j
    public static void pairDifference(int[] a){
        int i = 0;
        int j = 1;
        int k = 1;
        int n = a.length-1;
        boolean ans = false;
        while(i<=j && j <= n){
            int diff = a[j] - a[i];
            System.out.println("i: " +i+ ", j: "+j);
            System.out.println("diff "+diff);
            if(diff == k){
                ans = true;
                break;
            }else if(diff > k){
                i++;
            }else{
                j++;
            }
        }
        System.out.printf("Ans: %b %n", ans);
    }

    //container with most water
    public static void containerWater(int[] ht){
        int i = 0;
        int j = ht.length - 1;
        int water = 0;
//        int[] ht = {3,6,4,5,2};
        while(i < j){
            System.out.println("i: "+i + ", j: " +j);
            System.out.println("ht[i]: "+ht[i]  + " ht[j]: " +ht[j]);
            int amt = Math.min(ht[i] , ht[j]) * (j-i);
            System.out.println("amt: "+amt);
            System.out.println("water: "+water);
            water = Math.max(water, amt);
            System.out.println("water after calculation: "+water);
            if(ht[i] < ht[j]){
                i++;
                System.out.println("ht[i] < ht[j] i++: "+i);
            }else{
                //when we move i++ then there is no chance of getting more water since i < j
                //so we are moving j--
                j--;
                System.out.println("ht[i] > ht[j] j--: "+j);
            }
         }
        System.out.println(water);

    }
}
