package AMS;

import java.sql.*;
public class DatabaseConnection {
    Connection con;
    Statement stm;

    DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "Thakur@7");
            stm = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DatabaseConnection();
    }
}
