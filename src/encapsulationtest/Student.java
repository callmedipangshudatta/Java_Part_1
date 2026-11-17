
package encapsulationtest;

public class Student {

    // 1. Private instance variables
    private String studentName;
    private String rollNumber;
    private int age;
    private double marks;

    // 2. Parameterized Constructor
    public Student(String studentName, String rollNumber, int age, double marks) {

        if (studentName == null || studentName.isBlank()) {
            throw new IllegalArgumentException("Invalid student name");
        }

        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age");
        }

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid marks");
        }

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = marks;
    }

    // 3. Getters
    public String getStudentName() {
        return studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    // 4. Setters
    public void setStudentName(String studentName) {
        if (studentName == null || studentName.isBlank()) {
            System.out.println("Invalid student name");
            return;
        }

        this.studentName = studentName;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
            return;
        }

        this.age = age;
    }

    public void setMarks(double marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
            return;
        }

        this.marks = marks;
    }

    // 5. Display Student Details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    // 6. Calculate Grade
    public String calculateGrade() {

        if (marks >= 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 70) {
            return "C";
        }
        else if (marks >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
