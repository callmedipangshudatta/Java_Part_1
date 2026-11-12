//  Topic : Core Java - No-argument constructor
package com.core.java.oops;

public class Constructors {

    // Instance Variables
    String brand;
    String color;
    int speed;

    // Constructor
    Constructors() {
        brand = "BMW";
        color = "Red";
        speed = 100;

        System.out.println("Constructor is executed.");
    }

    public static void main(String[] args) {

        // Creating objects
        Constructors car1 = new Constructors();
        Constructors car2 = new Constructors();

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

/*
WHAT IS A CONSTRUCTOR?

A constructor is a special member of a class that gets
executed when an object is created.

IMPORTANT FEATURES:

1. Constructor name must be exactly the same as the class name.
2. It does not have a return type, not even void.
3. It gets invoked during object creation using new.
4. It can accept parameters.
5. Constructors can be overloaded.

WHAT HAPPENS DURING OBJECT CREATION?

1. Java encounters new.
2. Memory is allocated for the new object.
3. Instance variables receive their initial values.
4. Constructor executes and initializes the object.
5. The reference to the object is assigned to the reference variable.

TYPES OF CONSTRUCTORS:

1. Default constructor (compiler-provided).
2. No-argument constructor (explicitly written).
3. Parameterized constructor.

IMPORTANT:
If we don't declare any constructor, Java provides
a default constructor.

If we declare our own constructor, Java does not
automatically provide an additional default constructor.

CONSTRUCTOR VS METHOD:

Constructor                     Method
Same name as class              Can have any valid name
No return type                  Has a return type or void
Invoked during object creation  Called explicitly or through other execution flows
Initializes objects             Performs operations
Cannot be inherited             Methods can be inherited
*/
