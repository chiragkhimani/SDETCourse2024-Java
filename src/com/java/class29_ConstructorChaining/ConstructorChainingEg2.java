package com.java.class29_ConstructorChaining;

class Parent1 {
    Parent1(){
     System.out.println("1.Non Para in Parent1");
    }
    Parent1(int a){
    System.out.println("2. Parameterised Const in Parent1");
    }
}

class Child1 extends Parent1{
      Child1(){
         this(10);  //1,4

    }
    Child1(int a){
      System.out.println("4. Parameterised Const in Child1");
    }
}

public class ConstructorChainingEg2 {
    public static void main(String[] args) {
//      Child1 c1 = new Child1();           //1,4
      Child1 c2 = new Child1(10);     //

    }


}
