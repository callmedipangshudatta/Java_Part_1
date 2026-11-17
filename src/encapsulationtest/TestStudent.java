
package encapsulationtest;

public class TestStudent {

    public static void main(String[] args) {

        // 1. Create Student objects
        Student student1 = new Student("Rahul", "ST101", 21, 85);
        Student student2 = new Student("Aman", "ST102", 22, 55);

        // 2. Display initial details
        System.out.println("===== INITIAL STUDENT DETAILS =====");

        System.out.println("\n--- Student 1 ---");
        student1.displayStudentDetails();

        System.out.println("\n--- Student 2 ---");
        student2.displayStudentDetails();

        // 3. Update Rahul's marks
        student1.setMarks(95);

        // 4. Update Aman's age
        student2.setAge(23);

        // 5. Try assigning invalid marks
        System.out.println("\n===== VALIDATION TEST =====");
        student1.setMarks(150);

        // 6. Display updated details
        System.out.println("\n===== UPDATED STUDENT DETAILS =====");

        System.out.println("\n--- Student 1 ---");
        student1.displayStudentDetails();

        System.out.println("\n--- Student 2 ---");
        student2.displayStudentDetails();

        // 7. Calculate grades
        System.out.println("\n===== STUDENT GRADES =====");

        System.out.println("Rahul's Grade: " + student1.calculateGrade());
        System.out.println("Aman's Grade: " + student2.calculateGrade());
    }
}
