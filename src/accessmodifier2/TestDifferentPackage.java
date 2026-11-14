package accessmodifier2;

import accessmodifier.AccessModifiers;

public class TestDifferentPackage {
    public static void main(String[] args) {
        AccessModifiers car = new AccessModifiers();
        System.out.println(car.brand);
        System.out.println(car.color);
        System.out.println(car.speed);
    }
}


//  Variable	   Modifier	       Same package	        Different package, unrelated class
//  brand	        public	            Allowed	                            Allowed
//  price	        private	            Not allowed	                        Not allowed
//  speed	        protected	        Allowed	                            Not allowed
//  color	        package-private	    Allowed	                            Not allowed