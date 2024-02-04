package com.java.class10;

import java.util.Scanner;

public class Vowels_with_Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a letter");
        String s1 = sc.next();

        switch (s1) {
            case "A","a":
            case "E", "e":
            case "I", "i":
            case "O", "o":
            case "U", "u":
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");
        }

    }
}
