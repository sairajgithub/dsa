package com.practice.recursion;

public class SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(529));
    }

    public static int sumDigits(int num){
        if(num < 10) return num;
        int digit = num % 10;
        int temp = sumDigits(num/10);
        return  digit+temp;
    }
}
