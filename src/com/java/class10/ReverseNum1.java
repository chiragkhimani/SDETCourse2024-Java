package com.java.class10;

public class ReverseNum1 {

    public static void main(String[] args) {

        int num = 12345;
        int revNum = 0;

        while (num>0) {
            System.out.print(num%10); //9
            num = num/10;
        }

    }
}
