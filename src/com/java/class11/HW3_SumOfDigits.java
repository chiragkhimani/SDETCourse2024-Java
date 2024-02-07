package com.java.class11;

//2. Int num 198345
//
//        Output = Biggest Digit = 9

public class HW3_SumOfDigits {
    public static void main(String[] args) {

        //input
        int num = 23489978;
        int sum = 0;

        //Logic
        while (num > 0) {
            sum =  sum+ num % 10;
            System.out.println(sum);
            num = num / 10;
        }

        System.out.println(sum);


    }
}