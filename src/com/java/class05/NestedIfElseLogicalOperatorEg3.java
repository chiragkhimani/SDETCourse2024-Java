package com.java.class05;

public class NestedIfElseLogicalOperatorEg3 {

    // To check the persons eligibility for voting
//  Criteria -     Age>18 and Country = USA
    public static void main(String[] args) {

        int age = 16;
        String citizenship = "India";

        if (age > 18 && citizenship == "USA") {
                System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote"+" Because your age "+age+" and your country is "+citizenship);
       }
    }
}


