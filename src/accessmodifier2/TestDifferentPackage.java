package accessmodifier2;

import accessmodifier.AccessModifiers;

// Inheritance establishes a parent-child relationship.
public class TestDifferentPackage extends AccessModifiers {

    public static void main(String[] args) {

        // Creating an object of the subclass.
        TestDifferentPackage car = new TestDifferentPackage();

        System.out.println(car.brand);     // public
        System.out.println(car.speed);     // protected
        System.out.println(car.getPrice()); // public method
    }
}

//  So why we used Inheritance to call-out variables?

//  To establish a parent-child relationship between two classes.

//  So it can access inherited protected and public, but not
//  not necessarily private or package-private members

