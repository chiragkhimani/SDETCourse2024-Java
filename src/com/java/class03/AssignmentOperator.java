package com.java.class03;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = -10;
        int b = -20;
        int c;

        // Write your logic here
        c = b;
        b = a;
        a = c;

        System.out.println(a); //  1    0
        System.out.println(b); //  0    1
    }
}
