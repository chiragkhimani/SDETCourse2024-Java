package com.java.class31_Dynamic_Polymorphism;

class Parent {
    void print() {
        System.out.println("Parent");
    }
    void print1(){
        System.out.println("Parent1");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child");
    }
    void print2(){
        System.out.println("Child2");
    }

}

public class DpEg1 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.print(); //Parent

        Child c1 = new Child();
        c1.print(); //Child

        Parent pc1 = new Child(); //Dynamic Polymorphism
        pc1.print(); //Child    ,
        pc1.print1(); //Parent1 ,
//      pc1.print2(); We can not access it from child class

//        Child cp1 = new Parent(); //Not allowed


    }


}
