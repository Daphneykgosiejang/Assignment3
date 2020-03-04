package org.example;

public class Car extends Vehicle {
    int numberOfSeats = 4;


    public Car(String name, double price) {

        super(name, price);
    }

    public Car() {
        super();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}
