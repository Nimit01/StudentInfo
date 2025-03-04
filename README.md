# Student Management System

## Overview
This Java program implements a **menu-driven student management system** using **classes, arrays (ArrayList), instance members, and constructors**. It allows users to **add, display, search, update, and delete student records** with proper **exception handling**.

## Features
- **Add Students** (with validation checks for PRN, Name, DOB, and Marks)
- **Display All Students**
- **Search Students** (by PRN, Name, and Position)
- **Update Student Information**
- **Delete Student Records**
- **Exception Handling** (3 validation checks for each variable: Name, PRN, DOB, Marks)
- **User-friendly Menu-driven Interface**

## File Structure
- **`Student.java`**: Defines the `Student` class with attributes, getters, setters, and validation checks.
- **`StudentOperation.java`**: Manages student records using an `ArrayList<Student>`.
- **`Main.java`**: Implements the menu-driven program for user interaction.

## Exception Handling
Each variable in the `Student` class is validated with **three exception conditions**:
### **1. Name**
- Cannot be empty
- Must contain only alphabets
- Should be between 3 and 50 characters

### **2. PRN (Permanent Registration Number)**
- Must be a positive number
- Should be exactly 10 digits
- Must be within a valid range

### **3. Date of Birth (DOB)**
- Cannot be empty
- Must follow `YYYY-MM-DD` format
- Year should be between 1900 and 2025

### **4. Marks**
- Should be between 0 and 100
- Can have at most one decimal place
- Should be above 35 (passing criteria)

## How to Run
1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/StudentManagement.git
   cd StudentManagement
   ```
2. **Compile the Java files**
   ```bash
   javac Main.java Student.java StudentOperation.java
   ```
3. **Run the program**
   ```bash
   java Main
   ```

## Sample Output
```
1. Add Student
2. Display Students
3. Search by PRN
4. Search by Name
5. Search by Position
6. Update Student
7. Delete Student
8. Exit
Enter choice: 
```

## Author
- **Name**: [Nimit Prakash]

