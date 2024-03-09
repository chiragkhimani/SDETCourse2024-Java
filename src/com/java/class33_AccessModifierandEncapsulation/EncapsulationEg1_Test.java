package com.java.class33_AccessModifierandEncapsulation;

public class EncapsulationEg1_Test {

    public static void main(String[] args) {

        Bank i1 = new Bank();
        i1.setBalance(100_000_000);
        System.out.println(i1.getBalance());

        i1.setBalance(1_000_000_000);
        System.out.println(i1.getBalance());//

        Bank A1 = new Bank();
        A1.setBalance(10);//1
        A1.getBalance();

//       System.out.println(i1.balance); //0, 0, 0, error+1, 100_000_000

    }
}
