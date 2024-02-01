package com.java.class07;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

//       int num1 = 1; //

        if (num1 == 1) {
            System.out.println("Sunday");   //Sun  //Sun  //Sun Mon Tue //
        } else if (num1 == 2) {
            System.out.println("Monday");
        } else if (num1 == 3) {
            System.out.println("Tuesday");
        } else if (num1 == 4) {
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




