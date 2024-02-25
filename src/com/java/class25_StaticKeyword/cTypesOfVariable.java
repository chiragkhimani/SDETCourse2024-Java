package com.java.class25_StaticKeyword;

class Demo1 {

    static int b = 100; //Static variable
    int a = 10; //Instance variable

    void method1() {
        a = 50;//Instance variable
        int a = 20;  //Local variable
        System.out.println(a);
    }

    void method2() {
        System.out.println(a);////Instance variable
    }

    void method3() {
        System.out.println(b);//Static variable
    }

}

public class cTypesOfVariable {

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.method1(); //20
        d1.method2(); //10  20


    }


}
