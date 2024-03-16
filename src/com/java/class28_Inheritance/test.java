package com.java.class28_Inheritance;


class Parent9{

    public Parent9() {
        System.out.println("Parent");
    }
}

class Child9 extends Parent9{

    public Child9() {

        System.out.println("Child");
    }
}

public class test {

    public static void main(String[] args) {
        Child9 c = new Child9(); //Child    //Error
    }

}
