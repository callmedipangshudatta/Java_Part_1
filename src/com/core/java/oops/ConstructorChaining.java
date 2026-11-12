package com.core.java.oops;

public class ConstructorChaining {

    //  Non-Parameterized Constructor
    ConstructorChaining(){
        this("BMW");
        System.out.println("No-argument constructor");
    }

    //  Parameterized Constructor
    ConstructorChaining(String brand){
        System.out.println("Parameterized Constructor: " + brand);
    }

    public static void  main(String[] args){
        ConstructorChaining car = new ConstructorChaining();
    }
}
