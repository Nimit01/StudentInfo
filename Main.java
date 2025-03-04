//Main.java

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperation operations = new StudentOperation();

        while (true) {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
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
                    break;
                case 2:
                    operations.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

