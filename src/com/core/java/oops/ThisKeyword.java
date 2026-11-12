package com.core.java.oops;

public class ThisKeyword {
    String brand;
    String color;
    int speed;

    ThisKeyword(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public static void main(String[] args) {

        //  Creating objects
        ThisKeyword car1 = new ThisKeyword("BMW","Black",200);
        ThisKeyword car2 = new ThisKeyword("Audi","White",200);

        // Accessing properties
        System.out.println("Car 1:");
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.speed);

        System.out.println("\nCar 2:");
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.speed);
    }
}

/*

Rule	                    Explanation
Refers to current object	Identifies the object currently executing
Access instance variables	this.brand
Call instance methods	    this.display()
Call another constructor	this() — we'll study this separately

 */
