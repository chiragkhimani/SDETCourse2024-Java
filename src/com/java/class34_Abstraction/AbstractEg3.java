package com.java.class34_Abstraction;

class Test{

    void show(Number n){
        System.out.println(n);
    }

}

public class AbstractEg3 {
    public static void main(String[] args) {
//      Number n = new Number();
        Integer n1 = new Integer(10);
        System.out.println(n1);

        Test t = new Test();
        t.show(100000000000000l);
        t.show(10.10);
    }

}
