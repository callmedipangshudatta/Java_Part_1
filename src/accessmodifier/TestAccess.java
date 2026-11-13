package accessmodifier;

public class TestAccess {
    public static void main(String[] args) {
        AccessModifiers car = new AccessModifiers();
        System.out.println(car.brand);
        System.out.println(car.color);
        System.out.println(car.speed);

        //  Because price is private. Even bought both classes are in same package,
        //  only AccessModifiers itself can directly access it
        System.out.println(car.getPrice());
    }
}
