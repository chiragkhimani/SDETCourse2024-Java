package com.java.class29_ConstructorChaining;

class AnonymousObject{

    AnonymousObject(){
        System.out.println("Object created");
    }

    void print(){
        System.out.println("Hello there!!");
    }

}

public class zAnonymousObject {
    public static void main(String[] args) {

        int a =10;
        int b;
        b=20;

//        AnonymousObject c = new AnonymousObject();
//        AnonymousObject d;
//        d= new AnonymousObject();

             new AnonymousObject().print();

    }

}
