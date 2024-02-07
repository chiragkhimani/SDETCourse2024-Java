package com.java.class11;

//Int Orignal = 12321
//
//Output = The given is a palindrome number

public class HW4_PalindromeNumber {
    public static void main(String[] args) {

        //input
        int num = 123421;
        int saveNum = num;
        int revNum = 0;

        //Logic
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;

        }
        if (saveNum == revNum) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not a Palindrome");
        }

//        System.out.println(num);   //0
//        System.out.println(revNum); //12321


    }
}