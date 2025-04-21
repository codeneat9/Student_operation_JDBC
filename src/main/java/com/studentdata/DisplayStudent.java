package src.main.java.com.studentdata;

import java.sql.*;

public class DisplayStudent {

    public static void displayStudents() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("PRN: " + rs.getString("prn"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Batch: " + rs.getString("batch"));
                System.out.println("Position: " + rs.getString("position"));
                System.out.println("-----------------------------------");
            }

