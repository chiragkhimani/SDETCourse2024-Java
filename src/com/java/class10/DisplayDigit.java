package com.java.class10;

public class DisplayDigit {

    public static void main(String[] args) {

        //input
        int num = 23489978;

        //Logic
        while (num>0) {
            System.out.println(num%10); //9
            num = num/10;
        }

/*  //Output
    9
    8
    4
    3
    2
*/
    }




}
