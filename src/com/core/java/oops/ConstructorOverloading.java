package com.core.java.oops;

public class ConstructorOverloading {

    //  Instance Variables
    String brand;
    String color;
    int speed;

    //  1. No-Argument Constructor
    ConstructorOverloading(){
        brand = "Unknown";
        color = "White";
        speed = 0;

        System.out.println("\nNo-argument constructor executed.");
    }

    //  2. Parameterized Constructor (2 parameters)
    ConstructorOverloading(String brand, String color) {
        this.brand = brand;
        this.color = color;
        speed = 100;

        System.out.println("\nTwo-parameter constructor executed.");
    }

    //  3. Parameterized Constructor (3 parameters)
    ConstructorOverloading(String brand, String color,int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;

        System.out.println("\nThree-parameter constructor executed.");
    }

    public static void main(String[] args){

        //  Creating objects using different constructors
        ConstructorOverloading car1 = new ConstructorOverloading();

        // Displaying car1 properties
        System.out.println("\nCar 1:");
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.speed);

        ConstructorOverloading car2 = new ConstructorOverloading("BMW","Black");

        // Displaying car2 properties
        System.out.println("\nCar 2:");
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.speed);

        ConstructorOverloading car3 = new ConstructorOverloading("BMW","Navy Blue",220);

        // Displaying car3 properties
        System.out.println("\nCar 3:");
        System.out.println(car3.brand);
        System.out.println(car3.color);
        System.out.println(car3.speed);
    }
}

//  Java examines the arguments passed during object
//  creation and selects the matching constructor.

//  Java differentiate overloaded constructors using their
//  parameters lists, not their parameter names or return types

//  Differentiate happens by :
//  1. No. of Parameters
//  2. Parameter data types
//  3. Order of parameter data types

//  Example of Valid Overloading
/*
public class Car {

    Car() {
    }

    Car(String brand) {
    }

    Car(String brand, int speed) {
    }

    Car(int speed, String brand) {
    }
}
 */

