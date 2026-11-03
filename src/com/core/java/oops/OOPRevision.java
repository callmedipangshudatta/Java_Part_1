//organizes classes
package com.core.java.oops;

//non-public class -> Student
class Student{

    //name, age, course are instance variables
    String name;
    int age;
    String course;

    //displayDetails() is instance method
    void displayDetails(){
        System.out.println("Student Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Course: "+ course);
    }
}

//only one-public class
public class OOPRevision {
    public static void main(String[] args) {

        //s1, s2 reference variable
        //new Student() creates an object
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name  = "Rahul";
        s1.age = 19;
        s1.course = "Java";

        s2.name  = "Rohan";
        s2.age = 19;
        s2.course = "C++";

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

    }
}