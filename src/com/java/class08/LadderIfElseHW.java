package com.java.class08;

import java.util.Scanner;

//Program 1:
//        Write a Java program that takes the marks of a student as input and
//        prints the corresponding grade based on the following criteria:
//
//        90 or above: A
//        80-89: B
//        70-79: C
//        60-69: D
//        Below 60: F


public class LadderIfElseHW {

    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int marks = sc.nextInt();
        if (marks>=0 && marks <=100) {

            if (marks >= 90) {
                System.out.println("A");
            } else if (marks >=81 && marks < 90) {
                System.out.println("B");
            } else if (marks >= 71 && marks <= 80) {
                System.out.println("C");
            } else if (marks >= 61 && marks <= 70) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }else {
            System.out.println("You go home");

        }

    }
}