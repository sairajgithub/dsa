package com.practice.arrays;

// given an array 2d matrix (n*n) print outermost boundary of matrix
public class TwoDMatrixOuterBoundary {
   static int[][] mat = { {10, 20, 25, 15, 12, 11},
                          {19, 18, 13, 28, 101, 12},
                          {15, 5,  6,  7,  34, 13},
                          {9, 94,  73, 46, 41, 14},
                          {4, 43,  17, 18, 27, 15},
                          {8, 12,  24, 32, 23, 11}
                  };

    public static void main(String[] args) {
        printOuterBoundary(mat);
        printSpiral(mat);
    }

    public static void printSpiral(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int i = 0, j = 0;
        while(n>1 && m>1){

            for(int k=0; k<m-1; k++){
                System.out.println(mat[i][j]);
                j++;
            }

            for(int k=0; k<n-1; k++){
                System.out.println(mat[i][j]);
                i++;
            }

            for(int k=0; k<m-1; k++){
                System.out.println(mat[i][j]);
                j--;
            }

            for(int k=0; k<n-1; k++){
                System.out.println(mat[i][j]);
                i--;
            }

            System.out.println("i :" +i);
            System.out.println("j: "+j );

            i++;
            j++;

            n -= 2;
            m -= 2;
        }
        if( n==1){
            System.out.println(mat[i][j]);
        }
    }

    public static void printOuterBoundary(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int i = 0, j = 0;
        for(int k=0; k<m-1; k++){
            System.out.println(mat[i][j]);
            j++;
        }

        for(int k=0; k<n-1; k++){
            System.out.println(mat[i][j]);
            i++;
        }

        for(int k=0; k<m-1; k++){
            System.out.println(mat[i][j]);
            j--;
        }

        for(int k=0; k<n-1; k++){
            System.out.println(mat[i][j]);
            i--;
        }



    }

}