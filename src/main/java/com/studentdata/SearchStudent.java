package src.main.java.com.studentdata;

import java.sql.*;
import java.util.Scanner;

public class SearchStudent {

    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PRN/Name/Position to search: ");
        String searchQuery = sc.nextLine();

