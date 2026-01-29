package com.practice.arrays;

public class CountPairs {
    public static void main(String[] arr){
        char[] charArr = {'a','g','a','g','g'};
        int result = CountPairs.calculateBruteForce(charArr);
        System.out.println(result);
        result = CountPairs.calculateOptimizedMethod0(charArr);
        System.out.println(result);
        result = CountPairs.calculateOptimizedMethod1(charArr);
        System.out.println(result);
    }

    public static int calculateBruteForce(char[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] == 'a' && arr[j] == 'g')
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static int calculateOptimizedMethod0(char[] arr){
        int count = 0;
        int aCount = 0;
        for (char c: arr){
            if(c == 'a'){
                aCount++;
            }
            if(c == 'g'){
                count += aCount;
            }
        }
        return count;
    }

    public static int calculateOptimizedMethod1(char[] arr){
        int count = 0;
        int gCount = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]== 'g'){
                gCount++;
            }
            if(arr[i] == 'a'){
                count += gCount;
            }
        }
        return count;
    }

}
