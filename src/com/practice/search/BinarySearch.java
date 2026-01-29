package com.practice.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = {1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5};
        int[] floorArr = {12,23,34,35,36,56,61,64};
        System.out.println(binarySearch(arr, 4));
        System.out.println(findFirstOccurrence(arr1, 3));
        System.out.println(findLastOccurrence(arr1, 3));
        System.out.println(floor(floorArr, 64));
    }

    public static int floor(int[] arr, int k){
        int low = 0;
        int high = arr.length -1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] <= k){
                ans = arr[mid];
                low = mid + 1;
            } else{
                high = mid -1;
            }
        }
        return ans;
    }



    public static int findLastOccurrence(int[]arr, int k){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid  = low + (high - low) / 2;
            if(arr[mid] == k){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] > k){
                high = mid -1;
            }
            else if(arr[mid] < k){
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int findFirstOccurrence(int[]arr, int k){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid  = low + (high - low) / 2;
            if(arr[mid] == k){
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] > k){
                high = mid -1;
            }
            else if(arr[mid] < k){
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int binarySearch(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid  = low + (high - low) / 2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] > k){
                high = mid -1;
            }
            else if(arr[mid] < k){
                low = mid + 1;
            }
        }
        return -1;
    }
}
