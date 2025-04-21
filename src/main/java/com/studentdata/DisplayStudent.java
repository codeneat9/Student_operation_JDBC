package src.main.java.com.studentdata;

import java.sql.*;

public class DisplayStudent {

    public static void displayStudents() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

