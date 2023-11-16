package com.tom.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;
import java.util.concurrent.*;

public class App 
{
    public static void main( String[] args )
    {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "root";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // If the connection is successful
            if (conn != null) {
                System.out.println("Connected to the database successfully!");

                // Create a ThreadPoolExecutor
                ExecutorService executor = Executors.newFixedThreadPool(10);

                // Submit a task to fetch data
          
                    try (Statement stmt = conn.createStatement();
                         ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {
                            
                        // Process the result set
                        while (rs.next()) {
                            // Get metadata
                            ResultSetMetaData rsmd = rs.getMetaData();
                            int columnCount = rsmd.getColumnCount();

                            // The column count starts from 1
                            for (int i = 1; i <= columnCount; i++ ) {
                                String name = rsmd.getColumnName(i);
                                // Print column name and value
                                System.out.println(name + ": " + rs.getString(i));
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("Could not fetch data: " + e.getMessage());
                    }
            } 
            else {
                System.out.println("Failed to make connection!");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Could not load JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Could not connect to the database: " + e.getMessage());
        }
    }
}