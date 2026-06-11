package sdet_day17;

import java.sql.*;

public class Q1 {

    public static void main(String[] args) {

        try {

            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hemanth",
                    "root",
                    "hemanth");

            // SQL Query
            String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(query);

            // Insert Record 1
            ps.setInt(1, 101);
            ps.setString(2, "Hemanth");
            ps.setString(3, "IT");
            ps.setDouble(4, 55000);
            ps.executeUpdate();

            // Insert Record 2
            ps.setInt(1, 102);
            ps.setString(2, "Teja");
            ps.setString(3, "HR");
            ps.setDouble(4, 45000);
            ps.executeUpdate();

            // Insert Record 3
            ps.setInt(1, 103);
            ps.setString(2, "Sai");
            ps.setString(3, "Finance");
            ps.setDouble(4, 60000);
            ps.executeUpdate();

            // Insert Record 4
            ps.setInt(1, 104);
            ps.setString(2, "Harshi");
            ps.setString(3, "IT");
            ps.setDouble(4, 70000);
            ps.executeUpdate();

            // Insert Record 5
            ps.setInt(1, 105);
            ps.setString(2, "Narayana");
            ps.setString(3, "Sales");
            ps.setDouble(4, 48000);
            ps.executeUpdate();

            System.out.println("5 Records Inserted Successfully");

            // Close resources
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}