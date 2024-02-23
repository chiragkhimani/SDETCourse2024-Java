package com.java.class23_Review;

public class StringEg6 {
    public static void main(String[] args) {

    String str1 = new String("Hello");
    String str2 = new String("Hello");

        System.out.println(str1 == str2);  //Hello1
        System.out.println(str1 = str2);
        System.out.println(str1.equals(str2));
    }

}
