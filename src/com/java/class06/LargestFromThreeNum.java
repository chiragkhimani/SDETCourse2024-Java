package com.java.class06;


import java.util.Scanner;

public class LargestFromThreeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please type 3 numbers you want to check");

        int a = 30, b = 30, c = 30;


        if (a > b) {
            if (a > c) {
                System.out.println(a + "is the greatest num");
            } else {
                System.out.println(c + " is the greatest num");
            }

        } else {
            if (b > c) {
                System.out.println(b + " is the greatest num");
            } else {
                System.out.println(c + " is the greatest num");
            }
        }


    }

}
