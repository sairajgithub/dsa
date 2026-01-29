package com.practice.recursion;

import java.sql.DriverManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class power {
    public static void main(String[] args){
        System.out.println(pow(10, 2));
        System.out.println(powOptimized(10, 2));
    }

    public static int pow(int n, int base){
        if(n == 0){
            return 1;
        }
        return base * pow(n-1, base);
    }

    public static int powOptimized(int n, int base){
        if(n == 0) return 1;
        int temp = powOptimized(n/2, base);
        if( n%2 == 0){
            return temp*temp;
        }else {
            return temp*temp*base;
        }
    }
}
