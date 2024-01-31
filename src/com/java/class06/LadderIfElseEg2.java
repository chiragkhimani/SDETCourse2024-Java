package com.java.class06;

public class LadderIfElseEg2 {

    public static void main(String[] args) {

        // 1 - Sunday
        // 2 - Monday
        // 3 - Tuesday
        // 4 - Wednesday
        // 5 - Thursday
        // 6 - Friday
        // 7 - Saturday
        // 100 - Just enter from 1 to 7
        int num1 = 2;

        if (num1 > 1) {
            System.out.println("Sunday");   //Sun  //Sun  //Sun Mon Tue //
        } else if (num1 > 2) {
            System.out.println("Monday");
        } else if (num1 > 3) {
            System.out.println("Tuesday");
        } else if (num1 <= 4) {
            System.out.println("Wednesday");
        } else if (num1 == 5) {
            System.out.println("Thursday");
        } else if (num1 == 6) {
            System.out.println("Friday");
        } else if (num1 == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Enter a number from 1 to 7");
        }

        System.out.println("Hello, its end of the program");
    }

}

