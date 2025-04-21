package src.main.java.com.studentdata;

import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";  // Your MySQL username
    private static final String PASSWORD = "sql123(randomly given, to hidde my privacy)";  // Your MySQL password

    // Method to establish the connection to the database
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL Driver class
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found.", e);
        } catch (SQLException e) {
            throw new SQLException("Error while connecting to database.", e);
        }
    }
}
