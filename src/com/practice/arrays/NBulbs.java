package com.practice.arrays;

public class NBulbs {
    public static void main(String[] args){
        int[] bulbs = {1,0,1,0,1};
        int clicks = NBulbs.calculateMinClicks(bulbs);
        System.out.println(clicks);
    }

    public static int calculateMinClicks(int[] arr){
        int clicks = 0;

        for(int i=0; i<arr.length; i++){
            //    on           odd
            if(arr[i] == 1 && clicks%2 == 1){
                clicks+=1;
            }
            //    off           even
            else if(arr[i]==0 && clicks%2==0){
                clicks+=1;
            }
        }

        return clicks;
    }


}
