package com.java.class24_OOPs;

public class BankClass {
    //Variables
    String accountNumber;
    String accountName;
    int accountBalance;

//    //1. Default constructor - Created by Java
//    BankClass(){
//        accountNumber=null;
//        accountName=null;
//        accountBalance=0;
//
//    }

//    Non Parameterised Constructor
    BankClass(){

    }

//    //Parameterised Constructor
    BankClass(String accountNameFromUser){

        accountName = "Shyam";
//        accountNumber=accountName+ Math.random();
    }

    //Methods
  public void deposit(int amount){
    accountBalance = accountBalance+amount;
    }

    public void withdraw(int amount){
        accountBalance = accountBalance-amount;
    }

    public void showBalance(){
        System.out.println(accountBalance);

    }



}
