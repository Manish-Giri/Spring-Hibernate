package manishgiri.hibernatetutorial.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user="hbstudent", pass="hbstudent";
        //Connection connection = null;
        try{
            System.out.println("Connecting to DB... " + jdbcURL);
            Connection connection = DriverManager.getConnection(jdbcURL, user, pass);
            System.out.println("Connection successful...");

        }
        catch (SQLException e) {
            System.out.println("Connection failed: " + e);
        }

    }
}
