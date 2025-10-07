package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    public static Connection connect() {
        String url = System.getenv("DB_URL");
        String username = System.getenv("username");
        String password = System.getenv("password");
        try {
            Connection db = DriverManager.getConnection(url, username, password);
            return db;
        } catch (SQLException e) {
            System.out.println("Failing connnecting to database");
            e.printStackTrace();
            return null;


        }
    }
}
