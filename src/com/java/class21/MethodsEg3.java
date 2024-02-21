package com.java.class21;

public class MethodsEg3 {

    public static void main(String[] args) {

        int a  = sumOfNum(10,20);
        System.out.println(a);

        System.out.println(sumOfNum(10,20));

        if (a>0){
            System.out.println("Positive Number");
        }else {
            System.out.println("Not a Positive Number");
        }

    }

    public static int sumOfNum(int a, int b){
       int c = a-b;
        return c;
    }

}
