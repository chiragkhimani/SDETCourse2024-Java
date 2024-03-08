package com.java.class32;

class Bank {
   private int balance;

    Bank(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount){
        balance=balance-amount;
    }

    void deposit(int amount){
        balance=balance+amount;
    }

    void checkBal(){
        System.out.println(balance);
    }

}


public class EncapsulationEg1 {

}
