package com.practice.sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int[] arr = {3,5,5,6,3,3546,56,5,76,7};

//        bubbleSort(arr);
//        insertionSort(arr);
        int[] A = {1,5,34,6,7,8};
        int[] B=  {3,6,9,45,11,12,45,46,49};
//        System.out.println(Arrays.toString(merge(A, B)));
        System.out.println(Arrays.toString(mergeSort(B,0, B.length-1)));
//        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr,int start, int end){
        if(start == end){
            return new int[]{arr[start]};
        }
        int mid = (start+end)/2;
        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid+1, end);
        return merge(left, right);
    }

    public static int[] merge(int[] A, int[] B){
        int n = A.length;
        int m = B.length;
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        int[] temp = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(A[i] < B[j]){
                temp[k] = A[i];
                i++;
            }else {
                temp[k] = B[j];
                j++;
            }
            k++;
        }

        while(i<n){
            temp[k] = A[i];
            i++;
            k++;
        }

        while(j<m){
            temp[k] = B[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(temp));
       return temp;
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int left = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = left;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i =1; i<n; i++){
            for (int j = i-1; j>=0; j--) {
                if(arr[j] > arr[j+1]){
                    int left = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = left;
                }else{
                    break;
                }
            }
        }
    }
}
