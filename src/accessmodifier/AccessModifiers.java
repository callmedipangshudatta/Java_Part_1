package accessmodifier;

public class AccessModifiers {
    public String brand = "BMW";
    private double price = 5000000;
    protected int speed = 200;
    String color = "Black";
    public double  getPrice() {
        return price;
    }
}

// public → accessible everywhere.
// private → accessible only inside the declaring class.
// default → accessible only inside the same package.
// protected → accessible within the same package and through inheritance in a different package.