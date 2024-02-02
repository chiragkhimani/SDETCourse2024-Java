package com.java.class08;

import java.util.Scanner;

public class SwitchStatmtEg1 {
    ////Using swtich, if user enter 1 = print January
//                if user enter 2 = print February
//                if user enter 12 = print December
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want day in a week, then press 0, If you want month in a year, then press 1");
        int decision = sc.nextInt();

          if (decision==0) {
              System.out.println("Please enter from 1 to 7");
              int num1 = sc.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Please enter from 1 to 7");
            }
        } else {
              System.out.println("Please enter from 1 to 12");
              int num1 = sc.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Please, enter from 1 to 12");
            }


        }
    }


}
