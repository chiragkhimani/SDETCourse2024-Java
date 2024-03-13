package com.java.class34_Abstraction;

abstract class Car {

    int occupancy;

    public Car() {
    }

    public Car(int occupancy) {
        System.out.println(occupancy);
        this.occupancy = occupancy;
    }

    public void drive(int maxSpeed) {

        System.out.println("Driving at " + maxSpeed);
    }

    public abstract void carPlay();

    public abstract void fly();
}

abstract class Honda extends Car {

    public Honda() {
        super();
    }

    public Honda(int occupancy) {
        super(occupancy);
    }

    public void drive() {
        System.out.println("Driving");
    }

    public void carPlay() {
        System.out.println("Play Music");
    }
}

class Tesla extends Honda {

    public Tesla() {

    }

    public Tesla(int occupancy) {
        super(occupancy);

    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    public void fly1() {
        System.out.println("Flying1");
    }
}

public class AbstractEg1 {


}
