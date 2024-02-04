package com.java.class09;

public class CurrencyNote {

    public static void main(String[] args) {


        int num = 1252;
        int note1 = num/500;
        int note2 = (num%500)/100;
        int note3 = num%100;
        System.out.println("500 Notes "+note1);
        System.out.println("100 Notes "+note2);
        System.out.println("100 Notes "+note3);


    }
}
