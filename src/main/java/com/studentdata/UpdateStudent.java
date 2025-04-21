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

