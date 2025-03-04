// StudentOperation.java (Operations on Student Records)
import java.util.*;

public class StudentOperation { // Ensure class declaration is correct
    private ArrayList<Student> students;

    public StudentOperation() {
        this.students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.display();
            }
        }
    }

    // Search by PRN
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPrn() == prn) {
                return student;
            }
        }
        return null;
    }

    // Search by Name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Search by Position (Index in ArrayList)
    public Student searchByPosition(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return null;
    }

    // Update Student Details
    public boolean updateStudent(long prn, String newName, String newDob, double newMarks) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(newName);
            student.setDob(newDob);
            student.setMarks(newMarks);
            return true;
        }
        return false;
    }

    // Delete Student
    public boolean deleteStudent(long prn) {
        Student student = searchByPRN(prn);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
}
