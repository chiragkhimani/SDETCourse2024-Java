package com.java.class28_Inheritance;

//Parent, Super Class
public class BasicCalculator {

    String s1 = "Its morning, you can have more coffee!!";

    BasicCalculator(){
        System.out.println("I am parent constructor");
    }
    void sum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("sub = " + (a - b));
    }
}
//Child, Sub Class
class AdvCalculator extends BasicCalculator {

    AdvCalculator(){
        System.out.println("I am child constructor");

    }
    void mul(int a, int b) {
        System.out.println(a * b);
    }

    void div(int a, int b) {
        System.out.println(a / b);
    }

}

class DoubleAdvCalculator extends AdvCalculator {

    DoubleAdvCalculator(){
        System.out.println("I am grand-child constructor");
    }
    void mod(int a, int b) {
        System.out.println(a % b);
    }
}
