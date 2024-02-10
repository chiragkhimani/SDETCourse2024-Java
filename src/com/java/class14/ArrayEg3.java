package com.java.class14;

public class ArrayEg3 {

    public static void main(String[] args) {

        int[] age = new int[5];
        age[0] = 12;
        age[1] = 10;
        age[0] = 18;

        System.out.println(age[0]); //12, 10, 0,0,0 //12,10, nothing
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);

        System.out.println("=========================================");
        String[] animal = new String[5];
        animal[0] = "cat";

        System.out.println(animal[0]); //12, 10, 0,0,0 //12,10, nothing
        System.out.println(animal[1]);
        System.out.println(animal[2]);
        System.out.println(animal[3]);


    }
}
