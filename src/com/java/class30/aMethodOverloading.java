package com.java.class30;

class Demo {

    void createAccount(String name, String userName, String password) {
        System.out.println("Method1");
    }

    //Changing Types of Parameters
    void createAccount(String name, int phoneNumber, String password){
        System.out.println("Method4");
    }

    //Changing the Sequence/Order of Parameters
    void createAccount( int phoneNumber, String name, String password){
        System.out.println("Method5");
    }

    //Changing Number of Parameters
    void createAccount(String name, String userName){
        System.out.println("Method2");
    }

    void createAccount(String name){
        System.out.println("Method3");
    }

}

public class aMethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.createAccount("Shyam001", "Test");//

    }

}
