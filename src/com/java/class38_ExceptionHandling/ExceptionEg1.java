package com.java.class38_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEg1 {
    public static void main(String[] args) {

        int num[] = new int[5];
        String s = "Hello";

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(10 / 5); //2
            System.out.println(num[4]);
            System.out.println(s.length());

            int a = sc.nextInt();
            System.out.println(a);
        }

         catch (ArithmeticException e) {
            System.out.println("You can not divide the number by Zero" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Stay in your limit " + e.getMessage());
        }  catch (NullPointerException e) {
            System.out.println("Hey Null, You don't exist " + e.getMessage());
        } catch (Exception e){
            System.out.println("Something went wrong " + e.getMessage());
        }

        System.out.println("Have a great day!!"); // line
    }

}
