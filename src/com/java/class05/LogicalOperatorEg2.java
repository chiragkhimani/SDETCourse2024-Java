package com.java.class05;

public class LogicalOperatorEg2 {

    public static void main(String[] args) {

        boolean b1 = true, b2 = false, b3 = true;

        System.out.println(b1&&b2&&b3); //

        System.out.println(b1&&b2||b3&&b1); //true

        System.out.println(b1&&b2||b3&&b1&&b3&&b1||b1&&b2||b2);//true


    }

}
