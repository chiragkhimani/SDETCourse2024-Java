package com.java.class04;

public class StringConcatenation {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        String s3 = " ";
        int a = 10;
        int b = 20;

        System.out.println(s1 + s3 + s2);
        System.out.println(s1 + " " + s2);
        System.out.println(s1 + s2 + a + b);
        System.out.println(s1 + s2 + (a + b));
        System.out.println(a + b + s1);
        System.out.println(s1 + a * b);
        System.out.println("a+b");
//      System.out.println(s1+a-b);


    }
}
