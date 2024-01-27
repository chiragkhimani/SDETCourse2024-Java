package com.java.class03;

public class AssignmentOperatorMethod2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;

        // Write your logic here
        b = a + b;
        a = b - a;
        b = b - a;


        System.out.println(a); //  6    4
        System.out.println(b); //  4    6
    }
}
