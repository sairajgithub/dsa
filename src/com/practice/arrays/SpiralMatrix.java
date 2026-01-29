package com.practice.arrays;

public class SpiralMatrix {
    static int[][] mat = {  {10, 20, 25, 15, 12, 11},
                            {19, 18, 13, 28, 101, 12},
                            {15, 5,  6,  7,  34, 13},
                            {9, 94,  73, 46, 41, 14},
                            {4, 43,  17, 18, 27, 15}
    };

    public static void main(String[] args) {
        printSpiral(mat);
    }

    public static void printSpiral(int[][] mat){
        int row = mat[0].length;
        int col = mat.length;
        int i=0, j=0;
        while(row >1 && col >1) {
            System.out.println();
            for (int k = 1; k < row; k++) {
                System.out.print(mat[i][j] + " ");
                j++;
            }
            System.out.println();

            for (int k = 1; k < col; k++) {
                System.out.print(mat[i][j] + " ");
                i++;
            }
            System.out.println();
            for (int k = 1; k < row; k++) {
                System.out.print(mat[i][j] + " ");
                j--;
            }
            System.out.println();
            for (int k = 1; k < col; k++) {
                System.out.print(mat[i][j] + " ");
                i--;
            }
            System.out.println("i :"+i);
            System.out.println("j :"+j);
            i++;
            j++;
            row -= 2;
            col -= 2;
        }
    }
}
