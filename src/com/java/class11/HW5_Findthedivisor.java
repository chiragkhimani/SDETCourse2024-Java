package com.java.class11;

//5. Find the divisor of any number
//
//        int num = 10;
//
//        Output = 1,2,5,10

public class HW5_Findthedivisor {

    public static void main(String[] args) {

        int num = 10;  //1,2,5,10
        int i = 1;

        while (i<=num) {
            if (num % i == 0) {
                System.out.println(i);

            }
            i++;

        }


    }
}
