package com.java.class32;

class Shape {
    public void introduce() {
        System.out.println("I am a shape");
    }

    public double area() {
        //this method is to be overridden in child classes
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void introduce() {
        System.out.println("I am a circle!");
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    //Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void introduce() {
        System.out.println("I am a rectangle! ");
    }

    public double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void introduce() {
        System.out.println("I am a triangle");
    }

    public double area() {
        return 0.5 * base * height;
    }
}






















public class DpHWEg1 {
}
