package inheritance;

class Vehicle{
    String brand;
    void start(){
        System.out.println("vehicle started");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("car is driving");
    }
}
public class inheritance {
    public static void main(String[] args){
        Car car = new Car();
        car.brand = "BMW";

        System.out.println("car brand is "+car.brand);

        car.start();
        car.drive();
    }
}
