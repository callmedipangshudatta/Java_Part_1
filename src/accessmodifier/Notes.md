
# Java Access Modifiers

## 1. What are Access Modifiers?

Access modifiers in Java define **where a class's variables, methods, and constructors can be accessed from.**

Java provides four levels of access:

| Access Modifier | Accessibility |
|---|---|
| `public` | Accessible from everywhere. |
| `private` | Accessible only within the declaring class. |
| `protected` | Accessible within the same package and through inheritance in a different package. |
| Default (Package-private) | Accessible only within the same package. |

---

## 2. Our First Package: `accessmodifier`

We created two Java classes inside the same package:

- `AccessModifiers` → Contains variables with different access modifiers.
- `TestAccess` → Creates an object of `AccessModifiers` and accesses its variables.

### File 1: AccessModifiers.java

```java
package accessmodifier;

public class AccessModifiers {

    public String brand = "BMW";
    private double price = 5000000;
    protected int speed = 200;
    String color = "Black"; // Package-private

    public double getPrice() {
        return price;
    }
}
```

### Understanding the variables

| Variable | Access Modifier | Value |
|---|---|---|
| `brand` | public | BMW |
| `price` | private | 5000000 |
| `speed` | protected | 200 |
| `color` | Default (Package-private) | Black |

**Important:** When we don't explicitly write an access modifier, Java treats the member as package-private (default access).

For example:

```java
String color = "Black";
```

Here, `color` is not public or private. It has package-private access.

---

## 3. File 2: TestAccess.java

```java
package accessmodifier;

public class TestAccess {

    public static void main(String[] args) {

        AccessModifiers car = new AccessModifiers();

        System.out.println(car.brand);
        System.out.println(car.color);
        System.out.println(car.speed);

        // price is private, so we cannot access it directly.
        // We access it through the public getter method.

        System.out.println(car.getPrice());
    }
}
```

### What did we do here?

**Step 1: Created an object**

```java
AccessModifiers car = new AccessModifiers();
```

- `AccessModifiers` is the class.
- `car` is the reference variable.
- `new AccessModifiers()` creates an object.
- Through the object reference `car`, we access accessible members of the class.

**Step 2: Accessed public variable**

```java
System.out.println(car.brand);
```

Output:
```text
BMW
```

Why does it work?

Because `brand` is public, so it can be accessed from anywhere.

**Step 3: Accessed package-private variable**

```java
System.out.println(car.color);
```

Output:
```text
Black
```

Why does it work?

Because both `AccessModifiers` and `TestAccess` belong to the same package: `accessmodifier`.

Package-private members are accessible within the same package.

**Step 4: Accessed protected variable**

```java
System.out.println(car.speed);
```

Output:
```text
200
```

Why does it work?

Because both classes belong to the same package.

A protected member can be accessed by other classes within the same package, even without inheritance.

**Step 5: Accessed private variable through a getter**

```java
System.out.println(car.getPrice());
```

Output:
```text
5000000.0
```

Why didn't we write `car.price`?

Because `price` is private.

Private members can only be directly accessed inside the class in which they are declared.

Even though both classes belong to the same package, `TestAccess` cannot directly access `price`.

Instead, we created a public method:

```java
public double getPrice() {
    return price;
}
```

This method belongs to `AccessModifiers`, so it can access its own private variable.

`TestAccess` calls this public method to retrieve the value.

---

## 4. Expected Output

```text
BMW
Black
200
5000000.0
```

---

## 5. What Have We Learned?

1. `public` members can be accessed from anywhere.
2. `private` members can only be directly accessed within their declaring class.
3. `protected` members can be accessed within the same package without inheritance.
4. Package-private members can only be accessed within the same package.
5. A public getter method can provide controlled access to a private variable.
6. Creating an object does not mean we can access every variable inside its class. Access depends on the member's access modifier.

---

## 6. Important Understanding

**Remember these distinctions:**

- `car.brand` → Accessing a public variable through an object.
- `car.color` → Accessing a package-private variable through an object.
- `car.speed` → Accessing a protected variable through an object.
- `car.price` → Not allowed because price is private.
- `car.getPrice()` → Allowed because getPrice() is public.

The object reference does not override access restrictions. Java checks the access modifier before allowing access.

---

## 7. Next Practical Step

We will now move to the second package: `accessmodifier2`.

There, we will understand what happens when we try to access these same variables from a different package, and how inheritance changes protected access.
