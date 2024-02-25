package com.java.class25_StaticKeyword;

class Company {

    static String CEO = "Francis";
//        CEO ="Ardenis";

    String s1 = "Shyam";
//        s1="Hello";

    public void printCEO() {
        System.out.println(CEO);
    }

}

public class bCompanyTest {

    public static void main(String[] args) {

        Company e1 = new Company();

        Company e2 = new Company();

        e1.CEO = "Shyam";
        System.out.println(e1.CEO);

        e1.printCEO(); //F
        e2.printCEO(); //A

    }

}
