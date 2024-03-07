package com.java.class31_Dynamic_Polymorphism;

import java.util.Scanner;

public class DpEg2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browserFromUser = sc.next();

        Browser b;

        if (browserFromUser.equalsIgnoreCase("chrome")){
            b= new ChromeBrowser();

        }else {
            b = new FirefoxBrowser();

        }

        b.open();
        b.openIncognito();

    }
}
