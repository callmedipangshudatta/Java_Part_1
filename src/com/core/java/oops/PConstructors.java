package com.core.java.oops;

public class PConstructors {
    // Instance Variables
    String brand;
    String color;
    int speed;

    // Constructor
    PConstructors(String brand,String color,int speed) {

        //  this.brand - Instance variable belonging to the current object
        //  brand - Parameter received by the constructor
        this.brand = brand;
        this.color = color;
        this.speed = speed;

        System.out.println("Constructor is executed.");
    }

    public static void main(String[] args) {

        // Creating objects
        PConstructors car1 = new PConstructors("BMW", "Black", 200);
        PConstructors car2 = new PConstructors("Mercedes", "Navy Blue", 220);

        // Accessing car1 properties
        System.out.println("\nCar 1:");
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.speed);

        // Accessing car2 properties
        System.out.println("\nCar 2:");
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.speed);
    }
}
