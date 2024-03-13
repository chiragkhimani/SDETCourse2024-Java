package com.java.class35_Interface;

interface Bank {

   int a = 10;


    void deposit(int amount);

    public abstract void withdraw(int amount);

}

interface Compliance extends Bank {

    void audit();

}

abstract class PreCityBank implements Bank, Compliance {

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }
}

class CityBank extends PreCityBank {
    @Override
    public void audit() {

    }
}


public class BankTest {

    public static void main(String[] args) {
        CityBank c = new CityBank();
        c.withdraw(10);
        c.deposit(20);
        c.audit();
        System.out.println(Bank.a);
//        Bank.a=20; We can not change as it is final
    }


}
