package src.main.java.com.studentdata;

import java.sql.*;
import java.util.Scanner;

public class SearchStudent {

    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PRN/Name/Position to search: ");
        String searchQuery = sc.nextLine();

        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM students WHERE prn LIKE ? OR name LIKE ? OR position LIKE ?";
            PreparedStatement ps = conn.prepareStatement(query);
            String pattern = "%" + searchQuery + "%";
            ps.setString(1, pattern);
            ps.setString(2, pattern);
            ps.setString(3, pattern);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("PRN: " + rs.getString("prn"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Batch: " + rs.getString("batch"));
                System.out.println("Position: " + rs.getString("position"));
                System.out.println("-----------------------------------");
            }sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
