package com.java.class10;

public class CountDigit {

    public static void main(String[] args) {

        int num = 1234567;
        int count = 0;

        while (num>0) {
            count++;
            num = num/10;
        }

        System.out.println("Total digits= "+count);

    }


}
