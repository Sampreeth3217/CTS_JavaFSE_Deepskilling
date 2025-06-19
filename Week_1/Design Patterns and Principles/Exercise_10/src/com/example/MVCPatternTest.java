package com.example;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create model and view
        Student student = new Student("Alice", "S001", "A");
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        // Update model data
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        // Updated display
        controller.updateView();
    }
}
