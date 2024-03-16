package com.java.class28_Inheritance;

class Demo1 {

    void print() {

        System.out.println(this);

    }
}


public class thisPointer {

    public static void main(String[] args) {

        Demo1 obj = new Demo1();
        System.out.println(obj);
        obj.print();

    }
}
