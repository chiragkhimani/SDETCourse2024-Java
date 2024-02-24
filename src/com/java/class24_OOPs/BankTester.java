package com.java.class24_OOPs;

public class BankTester {

    public static void main(String[] args) {

        BankClass acc1 = new BankClass("Shyam");
        acc1.withdraw(100); //
        acc1.showBalance(); //-100
        System.out.println(acc1.accountName); //Shyam
        System.out.println(acc1.accountNumber); // Shyam________


        BankClass acc2 = new BankClass("Dauren");
        BankClass acc3 = new BankClass("Illiana");
        BankClass acc4 = new BankClass("Dinora");
        BankClass acc5 = new BankClass("Ardenis");

        BankClass acc6 = new BankClass(); //null

        System.out.println(acc2.accountName +" "+acc2.accountNumber);
        System.out.println(acc3.accountName+" "+acc3.accountNumber);
        System.out.println(acc4.accountName+" "+acc4.accountNumber);
        System.out.println(acc5.accountName+" "+acc5.accountNumber);

        System.out.println(acc5.accountNumber);

        System.out.println(acc6.accountName+" "+acc6.accountNumber);


//
//        System.out.println(acc2.accountNumber);//null
//        System.out.println(acc3.accountNumber);//null


    }



}
