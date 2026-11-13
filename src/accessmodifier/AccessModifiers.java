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

//  Private access is controlled by the declaring class, not the package
