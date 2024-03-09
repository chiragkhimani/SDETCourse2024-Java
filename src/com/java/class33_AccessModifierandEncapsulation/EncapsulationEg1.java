package com.java.class33_AccessModifierandEncapsulation;

class Bank {
    int count;
    private int balance;
    private String name;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        System.out.println("Iliana is accessing the account" + ++count);
        this.balance = balance;

    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }


}


public class EncapsulationEg1 {

}
