package com.java.class06;

public class zLargestFromThreeNumAndEqual {
    public static void main(String[] args) {

        int a = 10, b = 30, c = 30;

        if (a >= b && a >= c) {

            if (a == b) {
                System.out.println("A and B are equal");
            } else if (a == c) {
                System.out.println("A and C are equal");
            } else {

                System.out.println("A is the greatest num");
            }//A
        } else if (b >= c) {
            if (b == c) {
                System.out.println("B and C are equal");
            } else {
                System.out.println("B is the greatest num");
            }
        } else {
            System.out.println("C is the greatest num");
        }
    }


}


