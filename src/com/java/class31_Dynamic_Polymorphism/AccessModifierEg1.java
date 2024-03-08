package com.java.class31_Dynamic_Polymorphism;

public class AccessModifierEg1 {
    public String pub = "Public";
    protected String protect = "Protected";
    String def = "Default";
    private String pvt = "Private";

    public static void main(String[] args) {
        AccessModifierEg1 obj = new AccessModifierEg1();
        System.out.println(obj.pub);
        System.out.println(obj.def);
        System.out.println(obj.pvt);
        System.out.println(obj.protect);

    }

}
