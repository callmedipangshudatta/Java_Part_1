//  Topic : Core Java - Class and Object
//                    - Instance variables and methods
//                    - main() method
//                    - Object creating using new
//



package com.core.java.oops;

//  Class is a blueprint that defines what an object will have(properties)
//  and what it can do(methods).

public class ClassObject {

    //  Properties (Instance Variables)
    //  These variables define what information an object of
    //  "ClassObject" can hold
    String brand;
    String color;
    int speed;

    //  Method (Instance Method / Behavior)
    //  This defines what an object can do
    void drive(){
        System.out.println("Car is driving");
    }

    //  main
    public static void main(String[] args){

        //  Reference Object or Creating an Object
        ClassObject car1 = new ClassObject();

        //  Assigning values to object properties
        //  The dot operator accesses a member of
        //  the object through its reference
        car1.brand = "BMW";
        car1.color = "Black";
        car1.speed = 180;

        //  Accessing properties
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.speed);

        //  Calling method
        car1.drive();
    }
}
