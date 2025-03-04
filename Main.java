// Main.java

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperation operations = new StudentOperation();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1: // Add Student
                    try {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter PRN: ");
                        long prn = sc.nextLong();
                        sc.nextLine();
                        System.out.print("Enter DOB (YYYY-MM-DD): ");
                        String dob = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        operations.addStudent(new Student(name, prn, dob, marks));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter correct data types.");
                        sc.nextLine();
                    }
                    break;

                case 2: // Display Students
                    operations.displayStudents();
                    break;

                case 3: // Search by PRN
                    System.out.print("Enter PRN: ");
                    long searchPRN = sc.nextLong();
                    Student s = operations.searchByPRN(searchPRN);
                    if (s != null) s.display();
                    else System.out.println("Student not found.");
                    break;

                case 4: // Search by Name
                    System.out.print("Enter Name: ");
                    String searchName = sc.nextLine();
                    s = operations.searchByName(searchName);
                    if (s != null) s.display();
                    else System.out.println("Student not found.");
                    break;

                case 5: // Search by Position
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    s = operations.searchByPosition(pos);
                    if (s != null) s.display();
                    else System.out.println("Invalid position.");
                    break;

                case 6: // Update Student
                    System.out.print("Enter PRN of student to update: ");
                    long updatePRN = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New DOB: ");
                    String newDob = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();
                    if (operations.updateStudent(updatePRN, newName, newDob, newMarks))
                        System.out.println("Student updated.");
                    else System.out.println("Student not found.");
                    break;

                case 7: // Delete Student
                    System.out.print("Enter PRN to delete: ");
                    long deletePRN = sc.nextLong();
                    if (operations.deleteStudent(deletePRN))
                        System.out.println("Student deleted.");
                    else System.out.println("Student not found.");
                    break;

                case 8: // Exit
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
