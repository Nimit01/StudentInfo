// StudentOperation.java

import java.util.*;

class StudentOperation {
    private ArrayList<Student> students;

    public StudentOperation() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) System.out.println("No students found.");
        else students.forEach(Student::display);
    }
}