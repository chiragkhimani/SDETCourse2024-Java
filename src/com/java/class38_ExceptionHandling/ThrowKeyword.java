package com.java.class38_ExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args)  {


            calc(10,2); // 5


        System.out.println("Have a great day!!");//

    }

      static void calc( int a, int b) throws RuntimeException{

        if (b==0){
            throw new ArithmeticException("You can not divide by Zero");
        }
        System.out.println(a/b);
    }

}
