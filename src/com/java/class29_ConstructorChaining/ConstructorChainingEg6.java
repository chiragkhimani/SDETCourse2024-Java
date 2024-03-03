package com.java.class29_ConstructorChaining;

class Parent5 {

//If we do not have this non parameterised constructor then, at line 19 and 23
//        java will write super(); and we do not have non parameterised constructor
//         so it will give error,

//    Parent5() {
//        System.out.println("1.Non Para in Parent5");
//    }
    Parent5(int a) {
        System.out.println("2. Parameterised Const in Parent5");
    }
}

class Child5 extends Parent5 {
    Child5() {
        super(10);
        System.out.println("3.Non Para in Child");
    }
    Child5(int a) {
        super(10);
        System.out.println("4. Para in Child");
    }
}

public class ConstructorChainingEg6 {
    public static void main(String[] args) {
      Child5 c1 = new Child5(); //1,3
//    Child5 c2 = new Child5(10);   //1,
    }


}
