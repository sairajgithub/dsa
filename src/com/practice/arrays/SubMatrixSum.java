package com.practice.arrays;

public class SubMatrixSum {
    public static void main(String[] args){



    }

    //given a matrix find sum of all sub matrix sum
    // we calculate this using contribution technique
    // at any place of matrix the current value repetition will be (i+1)*(j+1)*(n-1)*(m-n)
    // where i and j are pointers in the loop and n and m are length of row and column values
    public static void sumOfAllSubMatrixSum(int[][] mat){
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                int freq = (i+1)*(j+1)*(n-1)*(m-n);
                sum += freq * mat[i][j];
            }
        }
        System.out.println("sum of all sub matrix: "+sum);
    }

    // Given row wise and column wise sorted matrix find maximum submatrix sum
    // since the matrix is row and column wise sorted we can fix the bottom right as mat[n-1][m-1]
    // we will check all possible sum from top right and return the max sum
    public static void maxSubMatrixSum(int[][] mat){
       int[][] psum = prefixSum(mat);
       int n = mat.length;
       int m = mat[0].length;

       int x2 = n-1;
       int y2 = m-1;
       int max = Integer.MIN_VALUE;
       for (int i= 0; i<n; i++){
           for (int j=0; j<n; j++){
               int x1 = i;
               int y1 = j;
               int sum = psum[x2][y2];
               if(x1>0){
                   sum -= psum[x1-1][y2];
               }
               if(y1>0){
                   sum -= psum[x2][y1-1];
               }
               if(x1>0 && y1>0){
                   sum += psum[x1-1][y1-1];
               }
               max = Math.max(sum, max);
           }
       }
    }


    //Given a N*M matrix and Q queries, for each query find sub matrix sum
    public static void solveQueriesOptimal(int[][] mat, int[][] q){

        int[][] psum = prefixSum(mat);

        for(int i=0; i<q.length; i++){
            int x1 = q[i][0];
            int y1 = q[i][1];

            int x2 = q[i][2];
            int y2 = q[i][3];

            int sum = psum[x2][y2];
            if(x1>0){
                sum -= psum[x1-1][y2];
            }
            if(y1>0){
                sum -= psum[x2][y1-1];
            }
            if(x1>0 && y1>0){
                sum += psum[x1-1][y1-1];
            }

            System.out.println(sum);
        }
    }

    public static int[][] prefixSum(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int[][] psum = new int[n][m];

        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j==0) {
                    psum[i][j] = mat[i][j];
                }else {
                    psum[i][j] = mat[i][j] + psum[i][j-1];
                }
            }
        }

        for(int j=0; j<m; j++){
            for (int i=1; i<n; i++){
                psum[i][j] = psum[i][j] + psum[i-1][j];
            }
        }

        return  psum;
    }
}
