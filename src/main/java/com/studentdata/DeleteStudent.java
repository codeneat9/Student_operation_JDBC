package src.main.java.com.studentdata;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {

    public static void deleteStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PRN to delete: ");
        String prn = sc.nextLine();

        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "DELETE FROM students WHERE prn = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, prn);

