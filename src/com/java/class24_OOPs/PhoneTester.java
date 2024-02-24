package com.java.class24_OOPs;

import javax.swing.*;

public class PhoneTester {

    public static void main(String[] args) {

        PhoneClass iPhone = new PhoneClass();
        PhoneClass moto = new PhoneClass();

        iPhone.screen = 10;
        iPhone.phoneBook ="Iliana";
        iPhone.color="pink";
        iPhone.camara=1000;

        System.out.println(iPhone.screen); //0
        System.out.println(iPhone.color); //null
        System.out.println(iPhone.phoneBook);//null
        System.out.println(iPhone.camara); //0.0

        moto.call("Aysha");
        iPhone.call("Iliana");   //
        iPhone.playMusic();
        iPhone.disappeared();
        iPhone.text();


//        System.out.println(moto.screen); //0
//        System.out.println(moto.color); //null
//        System.out.println(moto.phoneBook); //null
//        System.out.println(moto.camara); //0.0




    }

}



