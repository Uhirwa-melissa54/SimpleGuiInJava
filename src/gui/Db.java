package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    public static Connection connect() {
        String url = System.getenv("db_url_images");
        String username = System.getenv("db_user");
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
