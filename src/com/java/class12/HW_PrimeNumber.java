package com.java.class12;

public class HW_PrimeNumber {

    public static void main(String[] args) {
        int num = 10;  //1,2,5,10
        int i = 1;
        int count=0;

        while (i <= num) {       //10
            if (num % i == 0) {  //4
                count++;
//                System.out.println(i);
            }
            i++;
        }

        if (count==2) {
            System.out.println("It is prime number");
        }else
            System.out.println("it is not a prime number");
    }
}
