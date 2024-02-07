package com.java.class11;

//2. Int num 198345
//
//        Output = Biggest Digit = 9

public class HW2_FindtheBiggestNum {
    public static void main(String[] args) {

        //input
        int num = 23489978;
        int bigNum = 0;

        //Logic
        while (num > 0) {
            if (num % 10 > bigNum) {
                bigNum = num % 10;
            }
            num = num / 10;
        }

        System.out.println(bigNum);


    }
}