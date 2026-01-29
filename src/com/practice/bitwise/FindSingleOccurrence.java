package com.practice.bitwise;

import java.util.HashMap;
import java.util.Map;

public class FindSingleOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,1,1};
        System.out.println(13<<2);
        System.out.println(bruteForce(arr));
        System.out.println(optimizedHashMap(arr));
        System.out.println(optimizedBitWise(arr));
    }

    //TC O(n)
    public static int optimizedBitWise(int[] arr){
        int ans = 0;
        for (int num: arr){
            ans = ans ^ num;
        }
        return ans;
    }

    //TC O(n) SC O(n)
    public static int optimizedHashMap(int[] arr){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find element with frequency 1
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
    //TC O(n2)
    public static int bruteForce(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            boolean found =false;
                for(int j=0; j<n; j++) {
                    if (arr[i] == arr[j] && i != j) {
                        found = true;
                    }
                }
                if(!found){
                    return arr[i];
            }
        }
        return 0;
    }
}
