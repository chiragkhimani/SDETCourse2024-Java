package com.java.class10;

import java.util.Scanner;

public class Calculator_SwitchHW {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Num1");
        int i = sc.nextInt();
        System.out.println("Please enter Num2");
        int j = sc.nextInt();
        System.out.println("Please enter Operator");
        String operator = sc.next();

                switch (operator) {
                    case "+":
                        System.out.println("Result ="+(i+j));
                        break;
                    case "-":
                        System.out.println("Result ="+ (i-j));
                        break;
                    case "*":
                        System.out.println("Result ="+i*j);
                        break;
                    case "/":
                        System.out.println("Result ="+i/j);
                        break;
                    case "%":
                        System.out.println("Result ="+i%j);
                        break;
                    default:
                        System.out.println("Kindly enter only +, -, *, / and %");
                }


    }
}
