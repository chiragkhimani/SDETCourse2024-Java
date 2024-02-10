package com.java.class14;

public class ArrayEg2 {

    public static void main(String[] args) {

        //1. First way to declare array
        int student1[] = {10,20,30,40,50,60,70,80,90,10,20};

        System.out.println(student1.length);

//        System.out.println(student1[0]);
//        System.out.println(student1[1]);
//        System.out.println(student1[2]);
//        System.out.println(student1[3]);
//        System.out.println(student1[5]);
//        System.out.println(student1[6]);
//        System.out.println(student1[7]);

        for (int i =0; i<=student1.length; i++){
            System.out.println(student1[i]);
        }



    }

}
