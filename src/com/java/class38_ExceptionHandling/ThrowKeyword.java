package com.java.class38_ExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {

        int a =10, b=0;
            if (b==0){
                throw new ArithmeticException("You can not divide by Zero");
            }

        System.out.println("Hey Francis!!");
        System.out.println(a/b);

    }

    static void calc( int a, int b){

        if (b==0){
            throw new ArithmeticException("You can not divide by Zero");
        }
        System.out.println(a/b);
    }

}
