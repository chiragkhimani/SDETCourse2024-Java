package com.java.class25_StaticKeyword;

class Demo {
    static int a = 10;
    int b = 20;

    static void method1() {
        System.out.println(a);
    }

    static void method2() {

//        System.out.println(b); //It is not allowed, because we have to create object to access non static variable i.e.b
    }
}

public class dStaticMethod {
    public static void main(String[] args) {

        Demo.method1();//10
        Demo.method2();//20

    }
}
