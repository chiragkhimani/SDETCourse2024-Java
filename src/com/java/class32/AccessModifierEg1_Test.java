package com.java.class32;

import com.java.class31_Dynamic_Polymorphism.*;

public class AccessModifierEg1_Test extends AccessModifierEg1 {

    public static void main(String[] args) {
        AccessModifierEg1_Test obj = new AccessModifierEg1_Test();
        System.out.println(obj.pub);
//      System.out.println(obj.def);
//      System.out.println(obj.pvt);
        System.out.println(obj.protect);
    }
}
