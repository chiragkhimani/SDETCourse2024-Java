package com.java.class38_ExceptionHandling;

import java.io.IOException;

public class ThrowsKeyword {
    public static void main(String[] args) {

        try {
            checkAge(8);

        } catch (Exception e) {
            System.out.println("Age should bne >18");

        }

    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("the age has to be over 18");
        } else System.out.println("you are eligible to vote");
    }

}



