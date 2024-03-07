package com.java.class31_Dynamic_Polymorphism;

class Browser{
    void open(){
        System.out.println("Create some Browser");
    }

    void openIncognito(){
        System.out.println("openIncognito");
    }
}

class ChromeBrowser extends Browser{
    void open(){
        System.out.println("Chrome is opening");
    }
}

class FirefoxBrowser extends Browser{
    void open(){
        System.out.println("Firefox is opening");
    }
}


public class DpEg2 {

    public static void main(String[] args) {

    }
}
