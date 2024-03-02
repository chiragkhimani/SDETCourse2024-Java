package com.java.class28_Inheritance;

class Parent {
    int a = 10;
}

class Child extends Parent {
  int a = 20;

    void method1() {
        int a = 50;
        System.out.println(a); //50
        System.out.println(this.a); //20
        System.out.println(super.a); //10
    }
}

public class thisAndsuperKeyword {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.method1();
    }

}
