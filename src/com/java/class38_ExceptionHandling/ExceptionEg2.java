package com.java.class38_ExceptionHandling;

import java.util.Scanner;

public class ExceptionEg2 {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 5);//2
        }
        catch (Exception e) {
            System.out.println("You can not divide the number by Zero" + e.getMessage());
//            System.out.println(10 / 0);
        } finally {
            System.out.println("Have a great day!!"); // line
        }


    }

}
