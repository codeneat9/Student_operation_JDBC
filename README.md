# Student Data Entry with MySQL using JDBC

## BY:
### Yashwith Behara

## 📌 Project Description

This is a **Java console-based application** that enables CRUD operations on a student database using **JDBC (Java Database Connectivity)** and **MySQL**. It is designed using proper OOP principles with modular files for each operation.

The program supports the following functionalities:
- Add a new student
- Display all students
- Search for a student (by PRN, by name, or by position)
- Update/Edit student details
- Delete a student

---

## 🧠 Features

- Modular Java files: Each operation is encapsulated in a separate Java class
- MySQL integration using JDBC
- Clean code structure following Java coding standards
- Proper exception handling and comments for each block
- Interactive console interface
- Easy to extend and maintain
- Maven project with `pom.xml` for dependencies
- Database connection managed centrally in `DatabaseConnection.java`

---

## ⚙️ Operations Explained

### 1. `AddStudent.java`
- Adds a new student to the database.
- Collects PRN, name, and batch from the user via console input.
- Inserts data into the MySQL `students` table.

### 2. `DisplayStudent.java`
- Displays all student records.
- Fetches and prints all rows from the `students` table.

### 3. `SearchStudent.java`
- Allows searching for a student by:
  - PRN
  - Name
  - Position (row number in the result set)
- Displays the matched record if found.

### 4. `UpdateStudent.java`
- Edits details of an existing student.
- Prompts for PRN and updates the name or batch as needed.

### 5. `DeleteStudent.java`
- Deletes a student record based on PRN.

### 6. `DatabaseConnection.java`
- Manages database connection.
- Uses JDBC to connect to the MySQL `student_db` database.

---

## 🧾 MySQL Table Structure

Before running the application, make sure to create the following table in your MySQL database:

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    prn VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    batch VARCHAR(50)
);


