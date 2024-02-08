package com.java.class12;

public class Forloop_Factorial2 {

    //int 5 = 1*1+2*2+3*3

    // i = 5; 5*4*3*2*1
    public static void main(String[] args) {

        Long fact = 1L;
        int num = 10;

            for (int i = 1; i <=num ; i++) {
                fact = fact * i;

            }
            System.out.println(fact);

        //10*9*8*7*6*5*4*3*4*1


    }
}
