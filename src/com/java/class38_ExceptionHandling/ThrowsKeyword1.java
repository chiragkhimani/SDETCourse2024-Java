package com.java.class38_ExceptionHandling;

public class ThrowsKeyword1 {
    public static void main(String[] args) throws Exception {


            checkAge(8);

    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("the age has to be over 18");
        } else System.out.println("you are eligible to vote");
    }

}



