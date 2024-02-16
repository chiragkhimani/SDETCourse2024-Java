package com.java.class18;

public class StringMethods1 {

    public static void main(String[] args) {

        int a = 10;

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "hello";

//        System.out.println(s1==s2);
//        System.out.println(s2==s3); //false

        //1. String Equals Method
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s4));

        //2. Convert String Case
        System.out.println(s3.toLowerCase());
        System.out.println(s4.toUpperCase());

        //3. Contains
        String s5 = "Hello World, Welcome to Java";
        System.out.println(s5.contains(s4)); //false
        System.out.println(s5.toLowerCase().contains(s4));//true
        System.out.println(s5.toUpperCase().contains(s4.toUpperCase()));//true

    }




}
