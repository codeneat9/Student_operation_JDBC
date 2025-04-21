package src.main.java.com.studentdata;

import java.sql.*;
import java.util.Scanner;

public class AddStudent {

    public static void addStudent() {
        Scanner sc = new Scanner(System.in);

        // Getting student details from user
        System.out.println("Enter PRN: ");
        String prn = sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Batch: ");
        String batch = sc.nextLine();
        System.out.println("Enter Position: ");
        String position = sc.nextLine();

        // Connection to database
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO students (prn, name, batch, position) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            
