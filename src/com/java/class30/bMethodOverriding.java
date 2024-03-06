package com.java.class30;

class Parent {

    void driving() {
        System.out.println("driving ambassador");
    }

    void driving(String car) {
        System.out.println("driving "+car);
    }
}

class Child extends Parent {
    @Override
    void driving() {
//        super.driving();
        System.out.println("driving Tesla");
    }

    @Override
    void driving(String car) {
        System.out.println("driving "+car);
    }


}

public class bMethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.driving();
        c.driving("Tesla");
    }

}
