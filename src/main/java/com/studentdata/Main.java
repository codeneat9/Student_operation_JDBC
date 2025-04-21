package src.main.java.com.studentdata;

import java.util.Scanner;

public class Main {

    // Name: Yashwith Behara , PRN: 23070126151, Batch:B3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    AddStudent.addStudent();
                    break;
                case 2:
                    DisplayStudent.displayStudents();
                    break;
                case 3:
                    SearchStudent.searchStudent();
                    break;
                case 4:
                    UpdateStudent.updateStudent();
                    break;
                case 5:
                    DeleteStudent.deleteStudent();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }sc.close();
        }
    }
}
