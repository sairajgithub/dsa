package com.practice.modulus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
calculate a pow n % p where
1 <= a <=10 pow 9
1 <= n <= 10 pow 5
1 <= p <= 10 pow 9
 */
public class Main {
    Integer a= 10;

    public static void main(String[] args)  {
        System.out.println(1<<8);
        System.out.println(Math.pow(2,8));


        Main main = new Main();
        Student student= new Student();
        student.name = "sai";
        main.change(main.a, student);
        System.out.println(main.a);
        System.out.println(student.name);
    }

    public void change(Integer a, Student student){
        a = 20;
        student.name = "sairaj";
    }


    public static int calculate(int a, int n, int p){
        long ans = 1;
        for (int i=0; i<n; i++){
            ans = (ans * a) % p;
        }
        return (int)ans;
    }




}

class Student{
    String  name;
}
