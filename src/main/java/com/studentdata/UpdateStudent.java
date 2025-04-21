package src.main.java.com.studentdata;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudent {

    public static void updateStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PRN to update: ");
        String prn = sc.nextLine();

        System.out.println("Enter new Name: ");
        String name = sc.nextLine();
        System.out.println("Enter new Batch: ");
        String batch = sc.nextLine();
        System.out.println("Enter new Position: ");
        String position = sc.nextLine();

        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "UPDATE students SET name = ?, batch = ?, position = ? WHERE prn = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            // Setting parameters for the query
            ps.setString(1, name);
            ps.setString(2, batch);
            ps.setString(3, position);
            ps.setString(4, prn);

