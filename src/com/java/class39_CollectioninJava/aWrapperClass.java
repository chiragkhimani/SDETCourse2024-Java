package com.java.class39_CollectioninJava;

public class aWrapperClass {

    public static void main(String[] args) {

        int a = 10; //Primitive Data Type
        ;
        Integer b = Integer.valueOf(a); //Wrapper Class //autoboxing
        int c = b; //auto-unboxing

        System.out.println(a);
        System.out.println(b);

        String s = "12";
        Integer x = Integer.parseInt(s);
        System.out.println(x * 2); //24


    }


}
