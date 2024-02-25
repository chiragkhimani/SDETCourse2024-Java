package com.java.class25_StaticKeyword;

class Car {
    static int numOfCar;

    Car() {
        numOfCar++; //numOfCar = numOfCar+1;
    }
}

public class aCarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.numOfCar); //1

        Car c2 = new Car();
        System.out.println(c2.numOfCar); //2

        Car c3 = new Car();
        System.out.println(c3.numOfCar); //3

    }

}
