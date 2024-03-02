package com.java.class27_HomeworkDiscussion;

class Car {
    int speed; //instance

    void method1(int speed) { //local
        speed = speed + 200;  //local
        System.out.println(speed); //200

    }

}

public class aExample1 {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.method1(100); //300
        System.out.println(c1.speed); //0

    }

}
