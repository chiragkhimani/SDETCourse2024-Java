package com.java.class05;

// To check the person is eligible for the blood donation

//Age > 18 and weight > 50  --- You are eligible
//Age <18 and weight > 50  --- You are too young
// AGe > 18 and weight < 50 --- You are underweight
// AGe < 18 and weight < 50 --- You are not eligible

public class NestedIfElseEg4 {
    public static void main(String[] args) {

      int age = 18, weight =50;

            if (age>=18 && weight>=50 ){
                if (weight>=50){
                    System.out.println("You are eligible");
                }else {
                    System.out.println("You are underweight");
                }

            }else {
                if (weight>=50){
                    System.out.println("You are too young");
                }else {
                    System.out.println("You are not eligible");
                }





            }
    }



}
