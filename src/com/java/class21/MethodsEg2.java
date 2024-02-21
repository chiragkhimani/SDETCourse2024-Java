package com.java.class21;

import java.util.Scanner;

public class MethodsEg2{

    public static void main(String[] args) {

        primeNumber(10);

    }

    public static void primeNumber(int a){
        int num = a;  //1,2,5,10
        int i = 1;
        int count=0;

        while (i <= num) {       //10
            if (num % i == 0) {  //4
                count++;
//                System.out.println(i);
            }
            i++;
        }

        if (count==2) {
            System.out.println(num + "  is a prime number");
        }else
            System.out.println(num + " is not a prime number");

    }

}
