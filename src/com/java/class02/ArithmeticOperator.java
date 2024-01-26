package com.java.class02;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10, b = 8;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); // Modulo - Remainder
        System.out.println(18 % 4); // 2
        System.out.println(59 % 5); // 4
        System.out.println(5 % 10); // 5
        System.out.println(150 % 10); // 0

        System.out.println(10 % 2); // 0
        System.out.println(17 % 2); // 1
        System.out.println(51 % 2); // 1
        System.out.println(56 % 2); // 0

        System.out.println(110 % 10); // 0
        System.out.println(17 % 10); // 7
        System.out.println(451 % 10); // 1
        System.out.println(56 % 10); // 6

        System.out.println(110 / 10); // 11
        System.out.println(17 / 10); // 1
        System.out.println(451 / 10); // 45
        System.out.println(56 / 10); // 5
    }
}
