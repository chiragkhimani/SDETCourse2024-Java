package com.java.class05;

public class NestedIfElseEg1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        //Logic
        if (a > b) {
            if (a > c) {
                System.out.println("A is the greatest number");
            } else {
                System.out.println("C is the greatest number");
            }
        } else {
            if (b > c) {
                System.out.println("B is the greatest number");
            } else {
                System.out.println("C is the greatest number");
            }
        }


        //Output


    }
}
