package com.java.class35_Interface;

interface Dad {
    default void pocketMoneyfromDad(int amount) {
        System.out.println("Pocket Money from Dad is " + amount);
    }
}

interface Mom {
    default void pocketMoneyfromMom(int amount) {
        System.out.println("Pocket Money from Mom is " + amount);
    }
}

class Child implements Mom,Dad {

}


public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.pocketMoneyfromDad(1000000000);
        c.pocketMoneyfromMom(10);
    }

}
