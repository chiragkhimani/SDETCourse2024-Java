package com.java.class27_Inheritance;

public class BankTester {

    public static void main(String[] args) {

        BankClass a1 = new BankClass(1234, 100);
        BankClass a2 = new BankClass();

        a1.checkBalance(); //100
        a2.checkBalance(); //0
        System.out.println(BankClass.accOpened);//2

        a1.accOpened=190;
        a1.accBalance=100000000;

        System.out.println(a1.accOpened);  //190
        System.out.println(a2.accOpened);  //190

        System.out.println(a1.accBalance); //100000000
        System.out.println(a2.accBalance); //0

        a1.checkBalance();
        a2.checkBalance();

    }







}
