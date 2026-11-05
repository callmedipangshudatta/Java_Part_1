//  Topic : Core Java - Object Reference

package com.core.java.oops;

public class ObjectReference {

    // Instance variable (package-private)
    String brand;

    public static void main(String[] args) {

        // 1. Creating two independent objects
        ObjectReference car1 = new ObjectReference();
        ObjectReference car2 = new ObjectReference();

        // 2. Assigning values to their properties
        car1.brand = "BMW";
        car2.brand = "Audi";

        System.out.println("Independent Objects:");
        System.out.println("Car 1: " + car1.brand);
        System.out.println("Car 2: " + car2.brand);


        // 3. Changing one object's property
        car2.brand = "Mercedes";

        System.out.println("\nAfter changing car2:");
        System.out.println("Car 1: " + car1.brand);
        System.out.println("Car 2: " + car2.brand);


        // 4. Two references pointing to the same object
        ObjectReference car3 = new ObjectReference();
        ObjectReference car4 = car3;

        car3.brand = "Toyota";

        System.out.println("\nShared Object Reference:");
        System.out.println("Car 3: " + car3.brand);
        System.out.println("Car 4: " + car4.brand);


        // 5. Modifying the shared object through another reference
        car4.brand = "Honda";

        System.out.println("\nAfter changing car4:");
        System.out.println("Car 3: " + car3.brand);
        System.out.println("Car 4: " + car4.brand);


        // 6. Reassigning one reference to another object
        ObjectReference car5 = new ObjectReference();
        ObjectReference car6 = new ObjectReference();

        car5.brand = "BMW";
        car6.brand = "Audi";

        car5 = car6;

        System.out.println("\nAfter car5 = car6:");
        System.out.println("Car 5: " + car5.brand);
        System.out.println("Car 6: " + car6.brand);


        // 7. Modifying the object after reference reassignment
        car5.brand = "Mercedes";

        System.out.println("\nAfter changing car5:");
        System.out.println("Car 5: " + car5.brand);
        System.out.println("Car 6: " + car6.brand);

    }
}
