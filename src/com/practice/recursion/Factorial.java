package com.practice.recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(factorial(3));
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return factorial(n-1) * n;
    }
}
