package com.practice.recursion;

public class TowerOfHanoi {
    public static void main(String[] strings){
        toh(10,'S','D', 'H');
    }
    static int step = 0;
    public static void toh(int n, char src, char des, char hlp){
        if(n==0) return;


        //smaller problem
        //move n-1 plates from src to hlp using des
        toh(n-1, src, hlp, des);

        //move n plate from src to des
        step++;
        System.out.println("Step "+step+": Moving " + n + " from "+src+ " to "+ des);
        //smaller problem
        //move n-1 plates from hlp to des using src
        toh(n-1,hlp, des, src);
    }
}
