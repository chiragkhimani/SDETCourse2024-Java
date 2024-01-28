package com.java.class05;

public class NestedIfElseEg2 {

    // To check the persons eligibility for voting
//  Criteria -     Age>18 and Country = USA
    public static void main(String[] args) {

        int age = 16;
        String citizenship = "INdia";


        if (age > 18 ) {
            if (citizenship == "USA") {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("The country should be USA");
            }
        } else {
            System.out.println("You are not eligible to vote");

       }
    }
}


