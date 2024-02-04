package com.java.class09;

import java.util.Scanner;

public class CurrencyNote2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amount = 1052;
        int notes;

        notes=    1152/500;

        if (notes>0)
            System.out.println("500 Notes= "+notes);

        amount= amount%500;   //152
        notes = amount/100;

        if (notes>0)
        System.out.println("100 Notes= "+notes);

        amount= amount%100;        //152%100 = 52
        notes = amount/1;

        if (notes>0)
        System.out.println("1 Notes= "+notes);

    }
}
