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
            
            // Setting parameters for the query
            ps.setString(1, prn);
            ps.setString(2, name);
            ps.setString(3, batch);
            ps.setString(4, position);

            // Executing the query
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student added successfully!");
            }sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
