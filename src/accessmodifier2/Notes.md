# Protected Access and Inheritance in Java

## 1. Understanding Our Second Package

In the first package, we learned how access modifiers behave when two classes belong to the same package.

Now, we created another package called `accessmodifier2` to understand what happens when we try to access members of a class from a different package.

### Our Project Structure

```text
src/
│
├── accessmodifier/
│   ├── AccessModifiers.java
│   └── TestAccess.java
│
└── accessmodifier2/
    ├── Notes.md
    └── TestDifferentPackage.java
```

### Classes and Their Relationships

- `AccessModifiers` → Parent class (Superclass).
- `TestDifferentPackage` → Child class (Subclass).
- `extends` → Establishes inheritance.

---

## 2. TestDifferentPackage.java

```java
package accessmodifier2;

import accessmodifier.AccessModifiers;

// Inheritance establishes a parent-child relationship.
public class TestDifferentPackage extends AccessModifiers {

    public static void main(String[] args) {

        // Creating an object of the subclass.
        TestDifferentPackage car = new TestDifferentPackage();

        System.out.println(car.brand);      // public
        System.out.println(car.speed);      // protected
        System.out.println(car.getPrice()); // public method
    }
}
```

---

## 3. Understanding the Code Step by Step

### Step 1: Importing the Parent Class

```java
import accessmodifier.AccessModifiers;
```

Why did we import this class?

Because `AccessModifiers` belongs to another package: `accessmodifier`.

Importing allows us to refer to that class using its simple name.

### Step 2: Establishing Inheritance

```java
public class TestDifferentPackage extends AccessModifiers
```

Here:

- `TestDifferentPackage` is the child class.
- `AccessModifiers` is the parent class.
- `extends` establishes inheritance.

Because of inheritance, the child class inherits accessible members of the parent class.

### Step 3: Creating an Object of the Child Class

```java
TestDifferentPackage car = new TestDifferentPackage();
```

We created an object of the subclass.

This object can access its own members and inherited members that are accessible to it.

### Step 4: Accessing Public Members

```java
System.out.println(car.brand);
```

Output:

```text
BMW
```

Why does it work?

Because `brand` is declared as `public` in the parent class.

Public members can be accessed from other packages, provided the declaring class is accessible.

### Step 5: Accessing Protected Members

```java
System.out.println(car.speed);
```

Output:

```text
200
```

Why does it work?

Because `speed` is declared as `protected` in the parent class.

Normally, a protected member cannot be accessed by an unrelated class in another package.

However, `TestDifferentPackage` extends `AccessModifiers`.

Because inheritance establishes a parent-child relationship, the subclass can access the inherited protected member.

**Important:** Outside the declaring package, protected access is subject to subclass reference restrictions.

### Step 6: Accessing a Private Variable Through a Public Method

```java
System.out.println(car.getPrice());
```

Output:

```text
5000000.0
```

Why does it work?

In the parent class, we declared:

```java
private double price = 5000000;
```

A private variable cannot be directly accessed by its subclass.

However, the parent class provides a public getter:

```java
public double getPrice() {
    return price;
}
```

The getter accesses its own private variable and returns its value.

The child class can call this public method.

**Remember:** Inheritance does not give a subclass direct access to private members.

---

## 4. Access Modifier Comparison

Now let's compare the accessibility rules across different situations.

| Modifier | Same Package | Different Package (Unrelated Class) | Different Package (Subclass) |
|---|---|---|---|
| `public` | Allowed | Allowed | Allowed |
| `private` | Not allowed directly | Not allowed directly | Not allowed directly |
| `protected` | Allowed | Not allowed | Allowed through subclass access |
| Package-private | Allowed | Not allowed | Not allowed |

Note: Private members can be directly accessed only inside their declaring class.

---

## 5. Important: Protected Reference Restriction

This is one of the most important rules of protected access in Java.

Inside a subclass belonging to another package:

### Allowed

```java
TestDifferentPackage car = new TestDifferentPackage();

System.out.println(car.speed);
```

Why?

Because `car` is a reference of the subclass type, `TestDifferentPackage`.

The subclass can access the inherited protected member through its own subclass reference.

### Not Allowed

```java
AccessModifiers parent = new AccessModifiers();

System.out.println(parent.speed);
```

Why?

Because we are trying to access the protected member through an object reference of the parent class.

Outside the declaring package, a subclass cannot access a protected instance member through an arbitrary parent-class reference.

**Key distinction:** The restriction is not simply about which object was created. The reference type used to access the protected member matters.

---

## 6. Why Did We Use Inheritance?

We used inheritance to establish a parent-child relationship between two classes.

Our objective was to understand how a subclass can access inherited members of a parent class across different packages.

Without inheritance:

- `public` members remain accessible.
- `protected` members cannot be accessed by an unrelated class.
- `private` members cannot be accessed directly.
- Package-private members cannot be accessed.

With inheritance:

- `public` members remain accessible.
- `protected` members become accessible through the subclass, subject to reference restrictions.
- `private` members are not directly accessible.
- Package-private members are not accessible across packages.

---

## 7. Key Takeaways

1. `public` → Accessible from anywhere, provided the declaring class is accessible.
2. `private` → Directly accessible only inside the declaring class.
3. `protected` → Accessible within the same package and through subclass access in a different package.
4. Package-private → Accessible only within the same package.
5. `extends` → Establishes inheritance between parent and child classes.
6. Inheritance does not make private or package-private members accessible across packages.
7. A public getter can provide access to a private variable without exposing the variable directly.

---

## 8. What We Have Learned So Far

We have now explored two different situations:

**Package 1: `accessmodifier`**

- Two classes inside the same package.
- Tested all four access modifiers.
- Understood why private members cannot be directly accessed from another class.
- Used a public getter to retrieve a private variable.

**Package 2: `accessmodifier2`**

- Created a class in a different package.
- Imported the parent class.
- Established inheritance using `extends`.
- Accessed inherited public and protected members.
- Understood why private and package-private members cannot be directly accessed.
- Learned the protected reference restriction.

**Our main learning:** Access modifiers determine visibility, while inheritance establishes a relationship that allows subclasses to access inherited members according to Java's access rules.