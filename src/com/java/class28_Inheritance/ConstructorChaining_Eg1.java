package com.java.class28_Inheritance;

class Parent1 {
    Parent1() {
        System.out.println("1. Non Parameterised - Parent");
    }

    Parent1(int a) {
        System.out.println("2. Parameterised - Parent");
    }
}

class Child1 extends Parent1 {
    Child1() {
     super(10);
        System.out.println("3. Non Parameterised - Child");
    }

    Child1(int a) {
       super();
        System.out.println("4. Parameterised - Child");
    }
}

public class ConstructorChaining_Eg1 {

    public static void main(String[] args) {
//       Child1 c1 = new Child1();     //2,3   //3
     Child1 c2 = new Child1(10);


    }

}
