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
        //  If we broke this statement down:

        //  ClassObject : Class/Reference type
        //  car1/car2 : Reference Variable
        //  new : Creates an object
        //  ClassObject() : Constructor Call
        ClassObject car1 = new ClassObject();
        ClassObject car2 = new ClassObject();

        //  Assigning values to object properties by dot operator
        //  The dot operator accesses a member of
        //  the object through its reference
        car1.brand = "BMW";
        car1.color = "Black";
        car1.speed = 180;

        car2.brand = "Audi";
        car2.color = "White";
        car2.speed = 225;

        //  Accessing properties
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.speed);

        //  Objects can invoke methods defined in its class
        car1.drive();
    }
}
