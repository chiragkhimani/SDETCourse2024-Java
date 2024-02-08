package com.java.class12;

public class Forloop_Factorial {

    // i = 5; 5*4*3*2*1
    public static void main(String[] args) {

        int fact = 1;
        if (fact > 0) {
            for (int i = 5; i > 0; i--) {
                fact = fact * i;

            }
            System.out.println(fact);
        } else {
            System.out.println(fact);
        }
        //10*9*8*7*6*5*4*3*4*1


    }
}
