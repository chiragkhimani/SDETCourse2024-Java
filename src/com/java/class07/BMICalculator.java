package com.java.class07;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double weight = sc.nextInt();
        double height = sc.nextInt();

        {
            System.out.println("enter your weight and then height");
        }

        double BMI = weight / (height / 100 * height / 100);
        System.out.println(BMI);

        if (BMI < 18) {
            System.out.println("you are underweight");
        } else if (BMI >= 18 && BMI < 25) {
            System.out.println("you are healthy");
        } else if (BMI >= 25 && BMI < 29) {
            System.out.println("you are a overweight");
        } else if (BMI >= 29) {
            System.out.println("you are obese");
        }

    }


}
