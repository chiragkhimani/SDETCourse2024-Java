package com.java.class06;

public class LargestFromThreeNumLogicalOp {
    public static void main(String[] args) {

        int a = 10, b = 30, c = 30;

        if (a > b && a > c) {
            System.out.println("A is the greatest num");
        } else if (b > c) {
            System.out.println("B is the greatest num");
        } else {
            System.out.println("C is the greatest num");
        }
    }
}