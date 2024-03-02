package com.java.class27_HomeworkDiscussion;

public class BankClass {
    static int accOpened;
    int accountNumber;
    static int accBalance;

    BankClass() {
        accOpened++;
    }

    BankClass(int accNumberFromUser, int initialDepositFromUser) {
        accNumberFromUser = accNumberFromUser;
        accBalance = initialDepositFromUser;
       accOpened++;
    }

    void deposit(int balance) {
        accBalance = accBalance + balance;
    }

    void withdraw(int balance) {
        if (accBalance < balance) {
            System.out.println("You don't have sufficient balance to withdraw!");
        } else {
            accBalance = accBalance - balance;
        }
    }

    void checkBalance() {
        System.out.println(accBalance);
    }

}
