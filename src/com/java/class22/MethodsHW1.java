package com.java.class22;

import java.util.Scanner;

public class MethodsHW1 {


    public static void main(String[] args) {


        isPositiveOrNegative(sum(10,20));  //-10


    }

    public static int sum(int a, int b) {
        int c = a - b;
        return c;
    }

        public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }


}
