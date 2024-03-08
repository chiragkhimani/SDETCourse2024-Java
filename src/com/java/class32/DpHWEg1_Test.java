package com.java.class32;

import java.util.Scanner;

public class DpHWEg1_Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shape");
        String whichShape = sc.next();

        //Creating reference of Parent Class
        Shape obj1;
        if (whichShape.equalsIgnoreCase("Circle")) {
            //Creating object of Child Class with reference of Parent
            obj1 = new Circle(4);

        } else if (whichShape.equalsIgnoreCase("Rectangle")) {
            //Creating object of Child Class with reference of Parent
            obj1 = new Rectangle(5, 7);

        } else if (whichShape.equalsIgnoreCase("Triangle")) {

            //Creating object of Child Class with reference of Parent
            obj1 = new Triangle(3, 6);
        } else {
            System.out.println("Enter from Circle, Rectangle, Triangle");
            obj1=null;
        }

        obj1.introduce();
        System.out.println(obj1.area());


    }
}
