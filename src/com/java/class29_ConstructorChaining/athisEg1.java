package com.java.class29_ConstructorChaining;

class Test {
    String companyName;

    Test(String companyName) {
       this.companyName=companyName;
    }

    void print() {
        System.out.println(companyName); //null

    }
}

public class athisEg1 {
    public static void main(String[] args) {
        Test t = new Test("Meta");
        t.print();
    }
}
