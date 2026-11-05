//  Topic : Encapsulation

//  Package : Folder that organize related Java classes
package inheritance;

//  Here as we can see the "extends" keyword establishes an
//  inheritance relationship between the two classes
//  Because of this relationship,
//  Car inherits accessible member of Vehicle.

class Bike extends Vehicle{
    public void drive(){
        System.out.println("Bike is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.brand = "BMW";

        bike.start();
        bike.drive();

        System.out.println("Brand: " + bike.brand);
    }
}

//  Why code works?
//  bike.start() works because Car extends Vehicle, and start() is
//  public and inherited.

//  bike.brand works because brand is package-private and Bike and Main are
//  in same package
