package com.java.class21;

import java.util.Scanner;

public class MethodsEg1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        printLineDesign1(30, '=');
        System.out.println("Welcome to Calculator");
        printLineDesign1(30,'=');

        System.out.println("Enter number 1");
        int a = sc.nextInt();
        printLineDesign1(15,'*');

        System.out.println("Enter number 2");
        int b = sc.nextInt();
        printLineDesign1(15,'+');

        System.out.println("Result = " + (a+b));
    }

    public static void printLineDesign1(int length, char pattern){

        for (int i = 1; i <=length; i++) {

            System.out.print(pattern);
        }
        System.out.println();

    }





}
